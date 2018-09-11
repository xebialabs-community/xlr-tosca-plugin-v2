/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"pollCiTestEventsResultsResult"})
/*    */ @XmlRootElement(name="PollCiTestEventsResultsResponse")
/*    */ public class PollCiTestEventsResultsResponse
/*    */ {
/*    */   @XmlElementRef(name="PollCiTestEventsResultsResult", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse> pollCiTestEventsResultsResult;
/*    */   
/*    */   public JAXBElement<org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse> getPollCiTestEventsResultsResult()
/*    */   {
/* 50 */     return this.pollCiTestEventsResultsResult;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setPollCiTestEventsResultsResult(JAXBElement<org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse> value)
/*    */   {
/* 62 */     this.pollCiTestEventsResultsResult = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\PollCiTestEventsResultsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */