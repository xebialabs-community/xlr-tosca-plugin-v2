/*    */ package com.tricentis.continuousintegration.toscacixecution.testresult.junit;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ 
/*    */ @XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
/*    */ public abstract class AbstractCITestResultRootNode implements Serializable
/*    */ {
/*    */   @XmlElement(name="executionState")
/*    */   private String status;
/*    */   
/*    */   public String getStatus()
/*    */   {
/* 15 */     return this.status;
/*    */   }
/*    */   
/*    */   public void setStatus(String value) {
/* 19 */     this.status = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\com\tricentis\continuousintegration\toscacixecution\testresult\junit\AbstractCITestResultRootNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */