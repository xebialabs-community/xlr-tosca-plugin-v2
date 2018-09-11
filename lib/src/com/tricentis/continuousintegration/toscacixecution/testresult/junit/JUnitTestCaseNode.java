/*    */ package com.tricentis.continuousintegration.toscacixecution.testresult.junit;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ 
/*    */ @XmlRootElement(name="testcase")
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ public class JUnitTestCaseNode implements Serializable
/*    */ {
/*    */   @XmlElement(name="failure")
/*    */   private JUnitTestCaseFailure failure;
/*    */   
/*    */   public JUnitTestCaseFailure getTestCaseFailure()
/*    */   {
/* 20 */     return this.failure;
/*    */   }
/*    */   
/*    */   public void setTestCaseFailure(JUnitTestCaseFailure value) {
/* 24 */     this.failure = value;
/*    */   }
/*    */   
/*    */ 
/* 28 */   public void setTestCaseFailure(JAXBElement<JUnitTestCaseFailure> value) { this.failure = ((JUnitTestCaseFailure)value.getValue()); }
/*    */   
/*    */   @XmlAttribute(name="name")
/* 31 */   private String name = "";
/*    */   
/*    */   public String getName()
/*    */   {
/* 35 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String value) {
/* 39 */     this.name = value;
/*    */   }
/*    */   
/*    */ 
/* 43 */   public void setName(JAXBElement<String> value) { this.name = ((String)value.getValue()); }
/*    */   
/*    */   @XmlAttribute(name="time")
/* 46 */   private String time = "";
/*    */   
/*    */   public String getTime()
/*    */   {
/* 50 */     return this.time;
/*    */   }
/*    */   
/*    */   public void setTime(String value) {
/* 54 */     this.time = value;
/*    */   }
/*    */   
/*    */ 
/* 58 */   public void setTime(JAXBElement<String> value) { this.time = ((String)value.getValue()); }
/*    */   
/*    */   @XmlAttribute(name="timestamp")
/* 61 */   private String timeStamp = "";
/*    */   
/*    */   public String getTimeStamp()
/*    */   {
/* 65 */     return this.timeStamp;
/*    */   }
/*    */   
/*    */   public void setTimeStamp(String value) {
/* 69 */     this.timeStamp = value;
/*    */   }
/*    */   
/*    */ 
/* 73 */   public void setTimeStamp(JAXBElement<String> value) { this.timeStamp = ((String)value.getValue()); }
/*    */   
/*    */   @XmlAttribute(name="log")
/* 76 */   private String log = "";
/*    */   
/*    */   public String getLog()
/*    */   {
/* 80 */     return this.log;
/*    */   }
/*    */   
/*    */   public void setLog(String value) {
/* 84 */     this.log = value;
/*    */   }
/*    */   
/*    */   public void setLog(JAXBElement<String> value) {
/* 88 */     this.log = ((String)value.getValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testresult\junit\JUnitTestCaseNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */