

/* First created by JCasGen Sun Oct 05 17:45:05 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Sun Oct 05 17:45:06 EDT 2014
 * XML source: /home/prajwal/git/hw2-pyadapad/hw2-pyadapad/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class AnnotatorResults extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotatorResults.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotatorResults() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotatorResults(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotatorResults(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotatorResults(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCasProcessorId() {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.AnnotatorResults");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCasProcessorId(String v) {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.AnnotatorResults");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: geneData

  /** getter for geneData - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneData() {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_geneData == null)
      jcasType.jcas.throwFeatMissing("geneData", "edu.cmu.deiis.types.AnnotatorResults");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_geneData);}
    
  /** setter for geneData - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneData(String v) {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_geneData == null)
      jcasType.jcas.throwFeatMissing("geneData", "edu.cmu.deiis.types.AnnotatorResults");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_geneData, v);}    
   
    
  //*--------------*
  //* Feature: sentenceId

  /** getter for sentenceId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentenceId() {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "edu.cmu.deiis.types.AnnotatorResults");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_sentenceId);}
    
  /** setter for sentenceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceId(String v) {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "edu.cmu.deiis.types.AnnotatorResults");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_sentenceId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.AnnotatorResults");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.AnnotatorResults");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: startOffset

  /** getter for startOffset - gets 
   * @generated
   * @return value of the feature 
   */
  public int getStartOffset() {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_startOffset == null)
      jcasType.jcas.throwFeatMissing("startOffset", "edu.cmu.deiis.types.AnnotatorResults");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_startOffset);}
    
  /** setter for startOffset - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartOffset(int v) {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_startOffset == null)
      jcasType.jcas.throwFeatMissing("startOffset", "edu.cmu.deiis.types.AnnotatorResults");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_startOffset, v);}    
   
    
  //*--------------*
  //* Feature: endOffset

  /** getter for endOffset - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEndOffset() {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_endOffset == null)
      jcasType.jcas.throwFeatMissing("endOffset", "edu.cmu.deiis.types.AnnotatorResults");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_endOffset);}
    
  /** setter for endOffset - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndOffset(int v) {
    if (AnnotatorResults_Type.featOkTst && ((AnnotatorResults_Type)jcasType).casFeat_endOffset == null)
      jcasType.jcas.throwFeatMissing("endOffset", "edu.cmu.deiis.types.AnnotatorResults");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnnotatorResults_Type)jcasType).casFeatCode_endOffset, v);}    
  }

    