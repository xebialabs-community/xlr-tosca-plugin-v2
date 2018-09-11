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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DistributeRequest", propOrder={"eventCreator", "eventName", "eventStartTime", "executionListDetails"})
/*     */ public class DistributeRequest
/*     */ {
/*     */   @XmlElementRef(name="EventCreator", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> eventCreator;
/*     */   @XmlElementRef(name="EventName", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> eventName;
/*     */   @XmlElement(name="EventStartTime")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar eventStartTime;
/*     */   @XmlElementRef(name="ExecutionListDetails", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfDistributeRequestDetails> executionListDetails;
/*     */   
/*     */   public JAXBElement<String> getEventCreator()
/*     */   {
/*  64 */     return this.eventCreator;
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
/*  76 */     this.eventCreator = value;
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
/*  88 */     return this.eventName;
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
/* 100 */     this.eventName = value;
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
/* 112 */     return this.eventStartTime;
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
/* 124 */     this.eventStartTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfDistributeRequestDetails> getExecutionListDetails()
/*     */   {
/* 136 */     return this.executionListDetails;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExecutionListDetails(JAXBElement<ArrayOfDistributeRequestDetails> value)
/*     */   {
/* 148 */     this.executionListDetails = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\DistributeRequest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */