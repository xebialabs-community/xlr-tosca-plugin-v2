/*     */ package com.tricentis.continuousintegration.toscacixecution.testresult.junit;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ 
/*     */ @XmlRootElement(name="testsuite")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ public class JUnitTestSuiteNode implements Serializable
/*     */ {
/*     */   @XmlElement(name="testcase")
/*  18 */   private List<JUnitTestCaseNode> testcase = new ArrayList();
/*     */   
/*     */   public List<JUnitTestCaseNode> getTestCase()
/*     */   {
/*  22 */     return this.testcase;
/*     */   }
/*     */   
/*     */   public void setTestCase(List<JUnitTestCaseNode> value) {
/*  26 */     this.testcase = value;
/*     */   }
/*     */   
/*     */ 
/*  30 */   public void setTestCase(JAXBElement<List<JUnitTestCaseNode>> value) { this.testcase = ((List)value.getValue()); }
/*     */   
/*     */   @XmlElement(name="testsuite")
/*  33 */   private List<JUnitTestSuiteNode> testsuite = new ArrayList();
/*     */   
/*     */   public List<JUnitTestSuiteNode> getTestSuite()
/*     */   {
/*  37 */     return this.testsuite;
/*     */   }
/*     */   
/*     */   public void setTestSuite(List<JUnitTestSuiteNode> value) {
/*  41 */     this.testsuite = value;
/*     */   }
/*     */   
/*     */ 
/*  45 */   public void setTestSuite(JAXBElement<List<JUnitTestSuiteNode>> value) { this.testsuite = ((List)value.getValue()); }
/*     */   
/*     */   @XmlAttribute(name="name")
/*  48 */   private String name = "";
/*     */   
/*     */   public String getName()
/*     */   {
/*  52 */     return this.name;
/*     */   }
/*     */   
/*     */   public void setName(String value) {
/*  56 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*  60 */   public void setName(JAXBElement<String> value) { this.name = ((String)value.getValue()); }
/*     */   
/*     */   @XmlAttribute(name="tests")
/*  63 */   private String tests = "";
/*     */   
/*     */   public String getTests()
/*     */   {
/*  67 */     return this.tests;
/*     */   }
/*     */   
/*     */   public void setTests(String value) {
/*  71 */     this.tests = value;
/*     */   }
/*     */   
/*     */ 
/*  75 */   public void setTests(JAXBElement<String> value) { this.tests = ((String)value.getValue()); }
/*     */   
/*     */   @XmlAttribute(name="failures")
/*  78 */   private String failures = "";
/*     */   
/*     */   public String getFailures()
/*     */   {
/*  82 */     return this.failures;
/*     */   }
/*     */   
/*     */   public void setFailures(String value) {
/*  86 */     this.failures = value;
/*     */   }
/*     */   
/*     */ 
/*  90 */   public void setFailures(JAXBElement<String> value) { this.failures = ((String)value.getValue()); }
/*     */   
/*     */   @XmlAttribute(name="time")
/*  93 */   private String time = "";
/*     */   
/*     */   public String getTime()
/*     */   {
/*  97 */     return this.time;
/*     */   }
/*     */   
/*     */   public void setTime(String value) {
/* 101 */     this.time = value;
/*     */   }
/*     */   
/*     */ 
/* 105 */   public void setTime(JAXBElement<String> value) { this.time = ((String)value.getValue()); }
/*     */   
/*     */   @XmlAttribute(name="timestamp")
/* 108 */   private String timeStamp = "";
/*     */   
/*     */   public String getTimeStamp()
/*     */   {
/* 112 */     return this.timeStamp;
/*     */   }
/*     */   
/*     */   public void setTimeStamp(String value) {
/* 116 */     this.timeStamp = value;
/*     */   }
/*     */   
/*     */ 
/* 120 */   public void setTimeStamp(JAXBElement<String> value) { this.timeStamp = ((String)value.getValue()); }
/*     */   
/*     */   @XmlAttribute(name="id")
/* 123 */   private String id = "";
/*     */   
/*     */   public String getId()
/*     */   {
/* 127 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(String value) {
/* 131 */     this.id = value;
/*     */   }
/*     */   
/*     */ 
/* 135 */   public void setId(JAXBElement<String> value) { this.id = ((String)value.getValue()); }
/*     */   
/*     */   @XmlAttribute(name="log")
/* 138 */   private String log = "";
/*     */   
/*     */   public String getLog() {
/* 141 */     return this.log;
/*     */   }
/*     */   
/*     */   public void setLog(String value) {
/* 145 */     this.log = value;
/*     */   }
/*     */   
/*     */   public void setLog(JAXBElement<String> value) {
/* 149 */     this.log = ((String)value.getValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testresult\junit\JUnitTestSuiteNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */