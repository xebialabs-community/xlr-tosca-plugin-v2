/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DistributeCloudRequest", propOrder={"eventCreator", "eventID", "eventName", "eventStartTime", "executionListDetails", "workspaceId"})
/*     */ public class DistributeCloudRequest
/*     */ {
/*     */   @XmlElementRef(name="EventCreator", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> eventCreator;
/*     */   @XmlElement(name="EventID")
/*     */   protected String eventID;
/*     */   @XmlElementRef(name="EventName", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> eventName;
/*     */   @XmlElement(name="EventStartTime")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar eventStartTime;
/*     */   @XmlElementRef(name="ExecutionListDetails", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfDistributeCloudRequestDetails> executionListDetails;
/*     */   @XmlElementRef(name="WorkspaceId", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> workspaceId;
/*     */   
/*     */   public JAXBElement<String> getEventCreator()
/*     */   {
/*  72 */     return this.eventCreator;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventCreator(JAXBElement<String> value)
/*     */   {
/*  84 */     this.eventCreator = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getEventID()
/*     */   {
/*  96 */     return this.eventID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventID(String value)
/*     */   {
/* 108 */     this.eventID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getEventName()
/*     */   {
/* 120 */     return this.eventName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventName(JAXBElement<String> value)
/*     */   {
/* 132 */     this.eventName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public XMLGregorianCalendar getEventStartTime()
/*     */   {
/* 144 */     return this.eventStartTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventStartTime(XMLGregorianCalendar value)
/*     */   {
/* 156 */     this.eventStartTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfDistributeCloudRequestDetails> getExecutionListDetails()
/*     */   {
/* 168 */     return this.executionListDetails;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExecutionListDetails(JAXBElement<ArrayOfDistributeCloudRequestDetails> value)
/*     */   {
/* 180 */     this.executionListDetails = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getWorkspaceId()
/*     */   {
/* 192 */     return this.workspaceId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWorkspaceId(JAXBElement<String> value)
/*     */   {
/* 204 */     this.workspaceId = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\DistributeCloudRequest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */