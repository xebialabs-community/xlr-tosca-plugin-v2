/*    */ package com.tricentis.continuousintegration.toscacixecution.testresult.junit;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ 
/*    */ @javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
/*    */ public class JUnitTestCaseFailure
/*    */ {
/*    */   @javax.xml.bind.annotation.XmlValue
/*    */   private String text;
/*    */   @XmlAttribute(name="type")
/*    */   private String type;
/*    */   
/*    */   public String getText()
/*    */   {
/* 16 */     return this.text;
/*    */   }
/*    */   
/*    */   public void setText(String value) {
/* 20 */     this.text = value;
/*    */   }
/*    */   
/*    */   public void setText(JAXBElement<String> value) {
/* 24 */     this.text = ((String)value.getValue());
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getType()
/*    */   {
/* 31 */     return this.type;
/*    */   }
/*    */   
/*    */   public void setType(String value) {
/* 35 */     this.type = value;
/*    */   }
/*    */   
/*    */ 
/* 39 */   public void setType(JAXBElement<String> value) { this.type = ((String)value.getValue()); }
/*    */   
/*    */   @XmlAttribute(name="message")
/* 42 */   private String message = "";
/*    */   
/*    */   public String getMessage()
/*    */   {
/* 46 */     return this.message;
/*    */   }
/*    */   
/*    */   public void setMessage(String value) {
/* 50 */     this.message = value;
/*    */   }
/*    */   
/*    */   public void setMessage(JAXBElement<String> value) {
/* 54 */     this.message = ((String)value.getValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testresult\junit\JUnitTestCaseFailure.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */