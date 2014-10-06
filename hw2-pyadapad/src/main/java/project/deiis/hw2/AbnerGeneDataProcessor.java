package project.deiis.hw2;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import abner.Tagger;
import edu.cmu.deiis.types.Annotation;
import edu.cmu.deiis.types.InputData;

public class AbnerGeneDataProcessor extends JCasAnnotator_ImplBase {
  
  Tagger tagger = null;

  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
      tagger = new Tagger(1);
      processInstance(jCas);
  }

  /**
   * This method processes the input from the collection reader. Gets the sentence and tags gene names
   * using Abner library
   * @param jCas
   */
  public void processInstance(JCas jCas) {
    FSIterator<org.apache.uima.jcas.tcas.Annotation> it = jCas.getAnnotationIndex(InputData.type).iterator();
    int counter = jCas.getAnnotationIndex(Annotation.type).size() + 1;
    System.out.println("Counter is: "+counter);
    while (it.hasNext()) {
      InputData input = (InputData) it.next();
      String sentenceId = input.getSentenceId();
      String geneProduct = input.getGeneData();

      String[][] data = tagger.getEntities(geneProduct);
      for (int j=0; j<data[0].length; j++) {
        Annotation annotation = new Annotation(jCas);
        annotation.setCasProcessorId("Abner");
        annotation.setSentenceId(sentenceId);
        annotation.setGeneData(data[0][j]);
        annotation.setConfidence(1.0);
        int startOffset = 0;
        if(geneProduct.indexOf(data[0][j]) != -1)
          startOffset = geneProduct.substring(0, geneProduct.indexOf(data[0][j])).replace(" ", "").length();
        annotation.setStartOffset(startOffset);
        annotation.setEndOffset(startOffset + data[0][j].replace(" ", "").length() - 1);
        annotation.setBegin(counter++);
        annotation.addToIndexes();
        //System.out.println(data[1][j]+"\t["+data[0][j]+"]");
      }
    }
  }
}
