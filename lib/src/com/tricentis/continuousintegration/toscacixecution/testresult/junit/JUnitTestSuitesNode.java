/*    */ package com.tricentis.continuousintegration.toscacixecution.testresult.junit;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ 
/*    */ @XmlRootElement(name="testsuites")
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ public class JUnitTestSuitesNode
/*    */   implements Serializable
/*    */ {
/*    */   @XmlElement(name="testsuite")
/* 18 */   private List<JUnitTestSuiteNode> testsuite = new ArrayList();
/*    */   
/*    */   public List<JUnitTestSuiteNode> getTestSuite()
/*    */   {
/* 22 */     return this.testsuite;
/*    */   }
/*    */   
/*    */   public void setTestSuite(List<JUnitTestSuiteNode> value) {
/* 26 */     this.testsuite = value;
/*    */   }
/*    */   
/*    */   public void setTestSuite(JAXBElement<List<JUnitTestSuiteNode>> value) {
/* 30 */     this.testsuite = ((List)value.getValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testresult\junit\JUnitTestSuitesNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */