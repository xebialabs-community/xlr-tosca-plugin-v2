/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*     */ 
/*     */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
/*     */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
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
/*     */ @XmlType(name="DistributeCiTestEventsRequest", propOrder={"agentConfiguration", "ciClientId", "ciClientTimeout", "eventNames", "pollingInterval", "startTime"})
/*     */ public class DistributeCiTestEventsRequest
/*     */ {
/*     */   @XmlElementRef(name="AgentConfiguration", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfKeyValueOfstringstring> agentConfiguration;
/*     */   @XmlElement(name="CiClientId")
/*     */   protected String ciClientId;
/*     */   @XmlElement(name="CiClientTimeout")
/*     */   protected Integer ciClientTimeout;
/*     */   @XmlElementRef(name="EventNames", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Manager", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfstring> eventNames;
/*     */   @XmlElement(name="PollingInterval")
/*     */   protected Integer pollingInterval;
/*     */   @XmlElement(name="StartTime")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar startTime;
/*     */   
/*     */   public JAXBElement<ArrayOfKeyValueOfstringstring> getAgentConfiguration()
/*     */   {
/*  74 */     return this.agentConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAgentConfiguration(JAXBElement<ArrayOfKeyValueOfstringstring> value)
/*     */   {
/*  86 */     this.agentConfiguration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCiClientId()
/*     */   {
/*  98 */     return this.ciClientId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCiClientId(String value)
/*     */   {
/* 110 */     this.ciClientId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getCiClientTimeout()
/*     */   {
/* 122 */     return this.ciClientTimeout;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCiClientTimeout(Integer value)
/*     */   {
/* 134 */     this.ciClientTimeout = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfstring> getEventNames()
/*     */   {
/* 146 */     return this.eventNames;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventNames(JAXBElement<ArrayOfstring> value)
/*     */   {
/* 158 */     this.eventNames = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getPollingInterval()
/*     */   {
/* 170 */     return this.pollingInterval;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPollingInterval(Integer value)
/*     */   {
/* 182 */     this.pollingInterval = value;
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
/* 194 */     return this.startTime;
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
/* 206 */     this.startTime = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\DistributeCiTestEventsRequest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */