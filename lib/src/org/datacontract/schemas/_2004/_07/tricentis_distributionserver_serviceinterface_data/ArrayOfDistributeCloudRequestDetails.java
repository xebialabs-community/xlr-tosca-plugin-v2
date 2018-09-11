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
/*    */ @XmlType(name="ArrayOfDistributeCloudRequestDetails", propOrder={"distributeCloudRequestDetails"})
/*    */ public class ArrayOfDistributeCloudRequestDetails
/*    */ {
/*    */   @XmlElement(name="DistributeCloudRequestDetails", nillable=true)
/*    */   protected List<DistributeCloudRequestDetails> distributeCloudRequestDetails;
/*    */   
/*    */   public List<DistributeCloudRequestDetails> getDistributeCloudRequestDetails()
/*    */   {
/* 63 */     if (this.distributeCloudRequestDetails == null) {
/* 64 */       this.distributeCloudRequestDetails = new ArrayList();
/*    */     }
/* 66 */     return this.distributeCloudRequestDetails;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\ArrayOfDistributeCloudRequestDetails.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */