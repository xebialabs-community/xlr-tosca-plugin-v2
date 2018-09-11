/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsRequest;
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
/*    */ @XmlType(name="", propOrder={"pollCiTestEventsResultsRequest"})
/*    */ @XmlRootElement(name="PollCiTestEventsResults")
/*    */ public class PollCiTestEventsResults
/*    */ {
/*    */   @XmlElementRef(name="pollCiTestEventsResultsRequest", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<PollCiTestEventsResultsRequest> pollCiTestEventsResultsRequest;
/*    */   
/*    */   public JAXBElement<PollCiTestEventsResultsRequest> getPollCiTestEventsResultsRequest()
/*    */   {
/* 51 */     return this.pollCiTestEventsResultsRequest;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setPollCiTestEventsResultsRequest(JAXBElement<PollCiTestEventsResultsRequest> value)
/*    */   {
/* 63 */     this.pollCiTestEventsResultsRequest = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\PollCiTestEventsResults.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */