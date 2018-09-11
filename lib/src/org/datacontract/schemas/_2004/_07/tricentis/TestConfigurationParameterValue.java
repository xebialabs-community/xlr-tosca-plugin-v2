/*    */ package org.datacontract.schemas._2004._07.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
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
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="TestConfigurationParameterValue", propOrder={"key", "value"})
/*    */ public class TestConfigurationParameterValue
/*    */ {
/*    */   @XmlElement(name="Key")
/*    */   protected Integer key;
/*    */   @XmlElementRef(name="Value", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionBase", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<String> value;
/*    */   
/*    */   public Integer getKey()
/*    */   {
/* 53 */     return this.key;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setKey(Integer value)
/*    */   {
/* 65 */     this.key = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public JAXBElement<String> getValue()
/*    */   {
/* 77 */     return this.value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setValue(JAXBElement<String> value)
/*    */   {
/* 89 */     this.value = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\TestConfigurationParameterValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */