/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeRequest;
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
/*    */ @XmlType(name="", propOrder={"distributeRequest"})
/*    */ @XmlRootElement(name="Distribute")
/*    */ public class Distribute
/*    */ {
/*    */   @XmlElementRef(name="distributeRequest", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<DistributeRequest> distributeRequest;
/*    */   
/*    */   public JAXBElement<DistributeRequest> getDistributeRequest()
/*    */   {
/* 51 */     return this.distributeRequest;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setDistributeRequest(JAXBElement<DistributeRequest> value)
/*    */   {
/* 63 */     this.distributeRequest = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\Distribute.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */