/*    */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
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
/*    */ @XmlType(name="ArrayOfDistributeRequestDetails", propOrder={"distributeRequestDetails"})
/*    */ public class ArrayOfDistributeRequestDetails
/*    */ {
/*    */   @XmlElement(name="DistributeRequestDetails", nillable=true)
/*    */   protected List<DistributeRequestDetails> distributeRequestDetails;
/*    */   
/*    */   public List<DistributeRequestDetails> getDistributeRequestDetails()
/*    */   {
/* 63 */     if (this.distributeRequestDetails == null) {
/* 64 */       this.distributeRequestDetails = new ArrayList();
/*    */     }
/* 66 */     return this.distributeRequestDetails;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\ArrayOfDistributeRequestDetails.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */