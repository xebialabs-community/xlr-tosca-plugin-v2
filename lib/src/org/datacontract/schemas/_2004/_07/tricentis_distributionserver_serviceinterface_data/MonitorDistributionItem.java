/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver.AgentInfo;
/*     */ import org.datacontract.schemas._2004._07.tricentis_distributionserver.DistributionItemState;
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
/*     */ @XmlType(name="MonitorDistributionItem", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", propOrder={"agentInfo", "errorMessage", "eventId", "id", "monitorDistributionList", "state"})
/*     */ public class MonitorDistributionItem
/*     */ {
/*     */   @XmlElementRef(name="AgentInfo", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<AgentInfo> agentInfo;
/*     */   @XmlElementRef(name="ErrorMessage", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> errorMessage;
/*     */   @XmlElement(name="EventId")
/*     */   protected String eventId;
/*     */   @XmlElement(name="Id")
/*     */   protected String id;
/*     */   @XmlElementRef(name="MonitorDistributionList", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<MonitorDistributionList> monitorDistributionList;
/*     */   @XmlElement(name="State")
/*     */   protected DistributionItemState state;
/*     */   
/*     */   public JAXBElement<AgentInfo> getAgentInfo()
/*     */   {
/*  71 */     return this.agentInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAgentInfo(JAXBElement<AgentInfo> value)
/*     */   {
/*  83 */     this.agentInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<String> getErrorMessage()
/*     */   {
/*  95 */     return this.errorMessage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setErrorMessage(JAXBElement<String> value)
/*     */   {
/* 107 */     this.errorMessage = value;
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
/* 119 */     return this.eventId;
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
/* 131 */     this.eventId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getId()
/*     */   {
/* 143 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setId(String value)
/*     */   {
/* 155 */     this.id = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<MonitorDistributionList> getMonitorDistributionList()
/*     */   {
/* 167 */     return this.monitorDistributionList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMonitorDistributionList(JAXBElement<MonitorDistributionList> value)
/*     */   {
/* 179 */     this.monitorDistributionList = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DistributionItemState getState()
/*     */   {
/* 191 */     return this.state;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setState(DistributionItemState value)
/*     */   {
/* 203 */     this.state = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\MonitorDistributionItem.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */