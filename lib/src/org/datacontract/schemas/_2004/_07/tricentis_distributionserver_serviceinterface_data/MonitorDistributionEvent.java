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
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver.DistributionEventState;
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
/*     */ @XmlType(name="MonitorDistributionEvent", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", propOrder={"creator", "eventId", "eventState", "monitorDistributionItems", "name", "startTime"})
/*     */ public class MonitorDistributionEvent
/*     */ {
/*     */   @XmlElementRef(name="Creator", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> creator;
/*     */   @XmlElement(name="EventId")
/*     */   protected String eventId;
/*     */   @XmlElement(name="EventState")
/*     */   protected DistributionEventState eventState;
/*     */   @XmlElementRef(name="MonitorDistributionItems", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfMonitorDistributionItem> monitorDistributionItems;
/*     */   @XmlElementRef(name="Name", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> name;
/*     */   @XmlElement(name="StartTime")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar startTime;
/*     */   
/*     */   public JAXBElement<String> getCreator()
/*     */   {
/*  73 */     return this.creator;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCreator(JAXBElement<String> value)
/*     */   {
/*  85 */     this.creator = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getEventId()
/*     */   {
/*  97 */     return this.eventId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventId(String value)
/*     */   {
/* 109 */     this.eventId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributionEventState getEventState()
/*     */   {
/* 121 */     return this.eventState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventState(DistributionEventState value)
/*     */   {
/* 133 */     this.eventState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfMonitorDistributionItem> getMonitorDistributionItems()
/*     */   {
/* 145 */     return this.monitorDistributionItems;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMonitorDistributionItems(JAXBElement<ArrayOfMonitorDistributionItem> value)
/*     */   {
/* 157 */     this.monitorDistributionItems = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getName()
/*     */   {
/* 169 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(JAXBElement<String> value)
/*     */   {
/* 181 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public XMLGregorianCalendar getStartTime()
/*     */   {
/* 193 */     return this.startTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTime(XMLGregorianCalendar value)
/*     */   {
/* 205 */     this.startTime = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\MonitorDistributionEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */