/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.GetCloudResultResponse;
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
/*    */ @XmlType(name="", propOrder={"getCloudResultContainerResult"})
/*    */ @XmlRootElement(name="GetCloudResultContainerResponse")
/*    */ public class GetCloudResultContainerResponse
/*    */ {
/*    */   @XmlElementRef(name="GetCloudResultContainerResult", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<GetCloudResultResponse> getCloudResultContainerResult;
/*    */   
/*    */   public JAXBElement<GetCloudResultResponse> getGetCloudResultContainerResult()
/*    */   {
/* 51 */     return this.getCloudResultContainerResult;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setGetCloudResultContainerResult(JAXBElement<GetCloudResultResponse> value)
/*    */   {
/* 63 */     this.getCloudResultContainerResult = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\GetCloudResultContainerResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */