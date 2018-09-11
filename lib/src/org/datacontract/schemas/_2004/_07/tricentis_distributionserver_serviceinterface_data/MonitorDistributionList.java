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
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver.TestResult;
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
/*     */ @XmlType(name="MonitorDistributionList", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", propOrder={"endTime", "monitorDistributionEntries", "name", "startTime", "surrogate", "testResult"})
/*     */ public class MonitorDistributionList
/*     */ {
/*     */   @XmlElement(name="EndTime")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar endTime;
/*     */   @XmlElementRef(name="MonitorDistributionEntries", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfMonitorDistributionEntry> monitorDistributionEntries;
/*     */   @XmlElementRef(name="Name", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> name;
/*     */   @XmlElement(name="StartTime")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar startTime;
/*     */   @XmlElementRef(name="Surrogate", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> surrogate;
/*     */   @XmlElement(name="TestResult")
/*     */   protected TestResult testResult;
/*     */   
/*     */   public XMLGregorianCalendar getEndTime()
/*     */   {
/*  74 */     return this.endTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEndTime(XMLGregorianCalendar value)
/*     */   {
/*  86 */     this.endTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfMonitorDistributionEntry> getMonitorDistributionEntries()
/*     */   {
/*  98 */     return this.monitorDistributionEntries;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMonitorDistributionEntries(JAXBElement<ArrayOfMonitorDistributionEntry> value)
/*     */   {
/* 110 */     this.monitorDistributionEntries = value;
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
/* 122 */     return this.name;
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
/* 134 */     this.name = value;
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
/* 146 */     return this.startTime;
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
/* 158 */     this.startTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getSurrogate()
/*     */   {
/* 170 */     return this.surrogate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSurrogate(JAXBElement<String> value)
/*     */   {
/* 182 */     this.surrogate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TestResult getTestResult()
/*     */   {
/* 194 */     return this.testResult;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTestResult(TestResult value)
/*     */   {
/* 206 */     this.testResult = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\MonitorDistributionList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */