/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeCiTestEventsRequest;
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
/*    */ @XmlType(name="", propOrder={"distributeCiTestEventsRequest"})
/*    */ @XmlRootElement(name="DistributeCiTestEvents")
/*    */ public class DistributeCiTestEvents
/*    */ {
/*    */   @XmlElementRef(name="distributeCiTestEventsRequest", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<DistributeCiTestEventsRequest> distributeCiTestEventsRequest;
/*    */   
/*    */   public JAXBElement<DistributeCiTestEventsRequest> getDistributeCiTestEventsRequest()
/*    */   {
/* 51 */     return this.distributeCiTestEventsRequest;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setDistributeCiTestEventsRequest(JAXBElement<DistributeCiTestEventsRequest> value)
/*    */   {
/* 63 */     this.distributeCiTestEventsRequest = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\DistributeCiTestEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */