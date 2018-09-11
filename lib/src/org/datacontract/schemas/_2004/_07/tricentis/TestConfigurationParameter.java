/*     */ package org.datacontract.schemas._2004._07.tricentis;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="TestConfigurationParameter", propOrder={"comment", "currentValue", "name", "testConfigurationParameterValues"})
/*     */ public class TestConfigurationParameter
/*     */ {
/*     */   @XmlElementRef(name="Comment", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> comment;
/*     */   @XmlElementRef(name="CurrentValue", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> currentValue;
/*     */   @XmlElementRef(name="Name", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> name;
/*     */   @XmlElementRef(name="TestConfigurationParameterValues", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfTestConfigurationParameterValue> testConfigurationParameterValues;
/*     */   
/*     */   public JAXBElement<String> getComment()
/*     */   {
/*  60 */     return this.comment;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setComment(JAXBElement<String> value)
/*     */   {
/*  72 */     this.comment = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getCurrentValue()
/*     */   {
/*  84 */     return this.currentValue;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCurrentValue(JAXBElement<String> value)
/*     */   {
/*  96 */     this.currentValue = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getName()
/*     */   {
/* 108 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(JAXBElement<String> value)
/*     */   {
/* 120 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfTestConfigurationParameterValue> getTestConfigurationParameterValues()
/*     */   {
/* 132 */     return this.testConfigurationParameterValues;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTestConfigurationParameterValues(JAXBElement<ArrayOfTestConfigurationParameterValue> value)
/*     */   {
/* 144 */     this.testConfigurationParameterValues = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\TestConfigurationParameter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */