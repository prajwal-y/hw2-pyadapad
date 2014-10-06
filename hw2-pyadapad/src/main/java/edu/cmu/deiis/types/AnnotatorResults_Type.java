
/* First created by JCasGen Sun Oct 05 17:45:05 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Sun Oct 05 17:45:07 EDT 2014
 * @generated */
public class AnnotatorResults_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnnotatorResults_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnnotatorResults_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnnotatorResults(addr, AnnotatorResults_Type.this);
  			   AnnotatorResults_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnnotatorResults(addr, AnnotatorResults_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotatorResults.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.AnnotatorResults");
 
  /** @generated */
  final Feature casFeat_casProcessorId;
  /** @generated */
  final int     casFeatCode_casProcessorId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCasProcessorId(int addr) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.AnnotatorResults");
    return ll_cas.ll_getStringValue(addr, casFeatCode_casProcessorId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCasProcessorId(int addr, String v) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.AnnotatorResults");
    ll_cas.ll_setStringValue(addr, casFeatCode_casProcessorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geneData;
  /** @generated */
  final int     casFeatCode_geneData;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneData(int addr) {
        if (featOkTst && casFeat_geneData == null)
      jcas.throwFeatMissing("geneData", "edu.cmu.deiis.types.AnnotatorResults");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneData);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneData(int addr, String v) {
        if (featOkTst && casFeat_geneData == null)
      jcas.throwFeatMissing("geneData", "edu.cmu.deiis.types.AnnotatorResults");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneData, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentenceId;
  /** @generated */
  final int     casFeatCode_sentenceId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentenceId(int addr) {
        if (featOkTst && casFeat_sentenceId == null)
      jcas.throwFeatMissing("sentenceId", "edu.cmu.deiis.types.AnnotatorResults");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentenceId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceId(int addr, String v) {
        if (featOkTst && casFeat_sentenceId == null)
      jcas.throwFeatMissing("sentenceId", "edu.cmu.deiis.types.AnnotatorResults");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentenceId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.AnnotatorResults");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.AnnotatorResults");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startOffset;
  /** @generated */
  final int     casFeatCode_startOffset;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartOffset(int addr) {
        if (featOkTst && casFeat_startOffset == null)
      jcas.throwFeatMissing("startOffset", "edu.cmu.deiis.types.AnnotatorResults");
    return ll_cas.ll_getIntValue(addr, casFeatCode_startOffset);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartOffset(int addr, int v) {
        if (featOkTst && casFeat_startOffset == null)
      jcas.throwFeatMissing("startOffset", "edu.cmu.deiis.types.AnnotatorResults");
    ll_cas.ll_setIntValue(addr, casFeatCode_startOffset, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endOffset;
  /** @generated */
  final int     casFeatCode_endOffset;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndOffset(int addr) {
        if (featOkTst && casFeat_endOffset == null)
      jcas.throwFeatMissing("endOffset", "edu.cmu.deiis.types.AnnotatorResults");
    return ll_cas.ll_getIntValue(addr, casFeatCode_endOffset);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndOffset(int addr, int v) {
        if (featOkTst && casFeat_endOffset == null)
      jcas.throwFeatMissing("endOffset", "edu.cmu.deiis.types.AnnotatorResults");
    ll_cas.ll_setIntValue(addr, casFeatCode_endOffset, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotatorResults_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_casProcessorId = jcas.getRequiredFeatureDE(casType, "casProcessorId", "uima.cas.String", featOkTst);
    casFeatCode_casProcessorId  = (null == casFeat_casProcessorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_casProcessorId).getCode();

 
    casFeat_geneData = jcas.getRequiredFeatureDE(casType, "geneData", "uima.cas.String", featOkTst);
    casFeatCode_geneData  = (null == casFeat_geneData) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneData).getCode();

 
    casFeat_sentenceId = jcas.getRequiredFeatureDE(casType, "sentenceId", "uima.cas.String", featOkTst);
    casFeatCode_sentenceId  = (null == casFeat_sentenceId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceId).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_startOffset = jcas.getRequiredFeatureDE(casType, "startOffset", "uima.cas.Integer", featOkTst);
    casFeatCode_startOffset  = (null == casFeat_startOffset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startOffset).getCode();

 
    casFeat_endOffset = jcas.getRequiredFeatureDE(casType, "endOffset", "uima.cas.Integer", featOkTst);
    casFeatCode_endOffset  = (null == casFeat_endOffset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endOffset).getCode();

  }
}



    