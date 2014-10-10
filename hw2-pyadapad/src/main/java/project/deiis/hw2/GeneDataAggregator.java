package project.deiis.hw2;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import edu.cmu.deiis.types.Annotation;
import edu.cmu.deiis.types.Results;

/**
 * This class is the annotator for aggregating results from LingPipe and Abner annotators,
 * and choose the final values based on the confidence value from LingPipe.
 * @author pyadapad
 *
 */
public class GeneDataAggregator extends JCasAnnotator_ImplBase{

  HashMap<String, Double> lingPipeData = null;
  HashMap<String, Double> abnerData = null;
  ArrayList<String> order = null;
  
  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
    lingPipeData = new HashMap<String, Double>();
    abnerData = new HashMap<String, Double>();
    order = new ArrayList<String>();
    aggregateResults(jCas);
  }
  
  /**
   * This method aggregates the results from LingPipe and Abner annotators.
   * The results from LingPipe are scanned, and if the confidence is less than 0.6,
   * then the entry is confirmed by checking the result from Abner. This will help in
   * reducing the invalid entries.
   * @param jCas
   */
  private void aggregateResults(JCas jCas) {
    FSIterator<org.apache.uima.jcas.tcas.Annotation> it = jCas.getAnnotationIndex(Annotation.type).iterator();
    //System.out.println(jCas.getAnnotationIndex(Results.type).size());
    while (it.hasNext()) {
      Annotation at = (Annotation) it.next();
      //System.out.println(at.getCasProcessorId() + " and geneData is " + at.getGeneData());
      if(at.getCasProcessorId() != null && at.getCasProcessorId().equals("LingPipe")) {
        String key = at.getSentenceId()+":delim:"+at.getGeneData()+":delim:"+at.getStartOffset()+":delim:"+at.getEndOffset();
        order.add(key);
        lingPipeData.put(key, at.getConfidence());
      }
      else if(at.getCasProcessorId() != null && at.getCasProcessorId().equals("Abner")) {
        abnerData.put(at.getSentenceId()+":delim:"+at.getGeneData()+":delim:"+at.getStartOffset()+":delim:"+at.getEndOffset(), at.getConfidence());
      }
    }
    int counter = 0;
    for(String key : order) {
      double confidence = lingPipeData.get(key);
      if(confidence >= 0.9) {
        addToResults(key.split(":delim:"), jCas, counter++);
        continue;
      }
      else if(confidence < 0.9 && confidence > 0.3) {
        if(abnerData.containsKey(key)) {
          addToResults(key.split(":delim:"), jCas, counter++);
        }
      }
    }
  }
  
  /**
   * Creates the Result object which is sent to CasConsumer
   * @param data
   * @param jCas
   * @param counter
   */
  private void addToResults(String[] data, JCas jCas, int counter) {
    Results results = new Results(jCas);
    results.setSentenceId(data[0]);
    results.setGeneProduct(data[1]);
    results.setGeneStartOffset(Integer.parseInt(data[2]));
    results.setGeneEndOffset(Integer.parseInt(data[3]));
    results.setBegin(counter);
    results.addToIndexes();
  }

}
