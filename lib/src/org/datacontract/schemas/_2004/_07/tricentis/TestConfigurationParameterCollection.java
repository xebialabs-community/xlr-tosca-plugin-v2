/*    */ package org.datacontract.schemas._2004._07.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="TestConfigurationParameterCollection", propOrder={"testConfigurationParameters"})
/*    */ public class TestConfigurationParameterCollection
/*    */ {
/*    */   @XmlElementRef(name="TestConfigurationParameters", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<ArrayOfTestConfigurationParameter> testConfigurationParameters;
/*    */   
/*    */   public JAXBElement<ArrayOfTestConfigurationParameter> getTestConfigurationParameters()
/*    */   {
/* 48 */     return this.testConfigurationParameters;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setTestConfigurationParameters(JAXBElement<ArrayOfTestConfigurationParameter> value)
/*    */   {
/* 60 */     this.testConfigurationParameters = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\TestConfigurationParameterCollection.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */