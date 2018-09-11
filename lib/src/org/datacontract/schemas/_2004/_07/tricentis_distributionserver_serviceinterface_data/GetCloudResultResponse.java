/*    */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis.ArrayOfCloudResultContainer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ @XmlType(name="GetCloudResultResponse", propOrder={"cloudResultContainers"})
/*    */ public class GetCloudResultResponse
/*    */ {
/*    */   @XmlElementRef(name="CloudResultContainers", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<ArrayOfCloudResultContainer> cloudResultContainers;
/*    */   
/*    */   public JAXBElement<ArrayOfCloudResultContainer> getCloudResultContainers()
/*    */   {
/* 49 */     return this.cloudResultContainers;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setCloudResultContainers(JAXBElement<ArrayOfCloudResultContainer> value)
/*    */   {
/* 61 */     this.cloudResultContainers = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\GetCloudResultResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */