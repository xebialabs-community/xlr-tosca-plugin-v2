/*    */ package org.datacontract.schemas._2004._07.tricentis;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
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
/*    */ @XmlType(name="ArrayOfTestConfigurationParameterValue", propOrder={"testConfigurationParameterValue"})
/*    */ public class ArrayOfTestConfigurationParameterValue
/*    */ {
/*    */   @XmlElement(name="TestConfigurationParameterValue", nillable=true)
/*    */   protected List<TestConfigurationParameterValue> testConfigurationParameterValue;
/*    */   
/*    */   public List<TestConfigurationParameterValue> getTestConfigurationParameterValue()
/*    */   {
/* 63 */     if (this.testConfigurationParameterValue == null) {
/* 64 */       this.testConfigurationParameterValue = new ArrayList();
/*    */     }
/* 66 */     return this.testConfigurationParameterValue;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\ArrayOfTestConfigurationParameterValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */