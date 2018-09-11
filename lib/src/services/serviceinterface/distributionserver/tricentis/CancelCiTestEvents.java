/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.CancelCiTestEventsRequest;
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
/*    */ @XmlType(name="", propOrder={"cancelCiTestEventsRequest"})
/*    */ @XmlRootElement(name="CancelCiTestEvents")
/*    */ public class CancelCiTestEvents
/*    */ {
/*    */   @XmlElementRef(name="cancelCiTestEventsRequest", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<CancelCiTestEventsRequest> cancelCiTestEventsRequest;
/*    */   
/*    */   public JAXBElement<CancelCiTestEventsRequest> getCancelCiTestEventsRequest()
/*    */   {
/* 51 */     return this.cancelCiTestEventsRequest;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setCancelCiTestEventsRequest(JAXBElement<CancelCiTestEventsRequest> value)
/*    */   {
/* 63 */     this.cancelCiTestEventsRequest = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\CancelCiTestEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */