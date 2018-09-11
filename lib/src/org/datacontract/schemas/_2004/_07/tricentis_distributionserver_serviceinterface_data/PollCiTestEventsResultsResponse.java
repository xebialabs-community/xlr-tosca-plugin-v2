/*    */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="PollCiTestEventsResultsResponse", propOrder={"distributionEvents", "executionFinished"})
/*    */ public class PollCiTestEventsResultsResponse
/*    */ {
/*    */   @XmlElementRef(name="DistributionEvents", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<ArrayOfMonitorDistributionEvent> distributionEvents;
/*    */   @XmlElement(name="ExecutionFinished")
/*    */   protected Boolean executionFinished;
/*    */   
/*    */   public JAXBElement<ArrayOfMonitorDistributionEvent> getDistributionEvents()
/*    */   {
/* 53 */     return this.distributionEvents;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setDistributionEvents(JAXBElement<ArrayOfMonitorDistributionEvent> value)
/*    */   {
/* 65 */     this.distributionEvents = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public Boolean isExecutionFinished()
/*    */   {
/* 77 */     return this.executionFinished;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setExecutionFinished(Boolean value)
/*    */   {
/* 89 */     this.executionFinished = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\PollCiTestEventsResultsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */