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
/*    */ @XmlType(name="ArrayOfCloudResultContainer", propOrder={"cloudResultContainer"})
/*    */ public class ArrayOfCloudResultContainer
/*    */ {
/*    */   @XmlElement(name="CloudResultContainer", nillable=true)
/*    */   protected List<CloudResultContainer> cloudResultContainer;
/*    */   
/*    */   public List<CloudResultContainer> getCloudResultContainer()
/*    */   {
/* 63 */     if (this.cloudResultContainer == null) {
/* 64 */       this.cloudResultContainer = new ArrayList();
/*    */     }
/* 66 */     return this.cloudResultContainer;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis\ArrayOfCloudResultContainer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */