/*    */ package com.tricentis.continuousintegration.toscacixecution.testresult.junit;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ 
/*    */ @XmlRootElement(name="testResult")
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ public class JUnitRootNode extends AbstractCITestResultRootNode implements Serializable
/*    */ {
/*    */   @XmlElement(name="testsuites")
/*    */   private JUnitTestSuitesNode testsuites;
/*    */   
/*    */   public JUnitTestSuitesNode getTestSuites()
/*    */   {
/* 19 */     return this.testsuites;
/*    */   }
/*    */   
/*    */   public void setTestSuites(JUnitTestSuitesNode value) {
/* 23 */     this.testsuites = value;
/*    */   }
/*    */   
/*    */   public void setTestSuites(JAXBElement<JUnitTestSuitesNode> value) {
/* 27 */     this.testsuites = ((JUnitTestSuitesNode)value.getValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testresult\junit\JUnitRootNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */