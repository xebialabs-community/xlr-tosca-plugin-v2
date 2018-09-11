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
/*    */ @XmlType(name="ArrayOfTestConfigurationParameter", propOrder={"testConfigurationParameter"})
/*    */ public class ArrayOfTestConfigurationParameter
/*    */ {
/*    */   @XmlElement(name="TestConfigurationParameter", nillable=true)
/*    */   protected List<TestConfigurationParameter> testConfigurationParameter;
/*    */   
/*    */   public List<TestConfigurationParameter> getTestConfigurationParameter()
/*    */   {
/* 63 */     if (this.testConfigurationParameter == null) {
/* 64 */       this.testConfigurationParameter = new ArrayList();
/*    */     }
/* 66 */     return this.testConfigurationParameter;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\ArrayOfTestConfigurationParameter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */