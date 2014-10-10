package project.deiis.hw2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;

import edu.cmu.deiis.types.Annotation;
import edu.cmu.deiis.types.InputData;

/**
 * This class is responsible for using the LingPipe named entity recognition library to extract the
 * gene names based on a trained model (GENTAG). GeneDataProcessor is also responsible for
 * calculating the start and end offsets for the output, and passing the output to Cas Consumer
 * using the Results feature.
 * 
 * @author pyadapad
 *
 */
public class LingPipeGeneDataProcessor extends JCasAnnotator_ImplBase {

  ConfidenceChunker chunker = null;

  private static String MODEL = "model";

  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
    System.out.println("Processing using LingPipe");
    try {
      chunker = (ConfidenceChunker) AbstractExternalizable
              .readResourceObject(LingPipeGeneDataProcessor.class, (String) getContext()
                      .getConfigParameterValue(MODEL));
    } catch (IOException e) {
      System.out.println("IOException occurred: " + e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println("ClassNotFoundException occurred: " + e.getMessage());
    }
    processInstance(jCas);
  }

  /**
   * This method processes the input from the collection reader. Gets the sentence and fetches the
   * gene names using the Chunking API of LingPipe
   * 
   * @param jCas
   */
  public void processInstance(JCas jCas) {
    FSIterator<org.apache.uima.jcas.tcas.Annotation> it = jCas.getAnnotationIndex(InputData.type)
            .iterator();
    int counter = 0;
    while (it.hasNext()) {
      InputData input = (InputData) it.next();
      String sentenceId = input.getSentenceId();
      String geneProduct = input.getGeneData();

      Iterator<Chunk> iter = chunker.nBestChunks(geneProduct.toCharArray(), 0,
              geneProduct.length(), 5);
      counter++;
      while (iter.hasNext()) {
        Chunk c = (Chunk) iter.next();
        double confidence = Math.pow(2.0, c.score());
        int start = c.start();
        int end = c.end();
        String gene = geneProduct.substring(start, end);
        Annotation annotation = new Annotation(jCas);
        annotation.setCasProcessorId("LingPipe");
        annotation.setSentenceId(sentenceId);
        annotation.setGeneData(gene);
        annotation.setConfidence(confidence);
        int startOffset = 0;
        if (start != 0)
          startOffset = geneProduct.substring(0, start - 1).replace(" ", "").length();
        annotation.setStartOffset(startOffset);
        annotation.setEndOffset(startOffset + gene.replace(" ", "").length() - 1);
        annotation.setBegin(counter);
        annotation.setEnd(geneProduct.length() - startOffset);
        annotation.addToIndexes();
      }
    }
  }
}
