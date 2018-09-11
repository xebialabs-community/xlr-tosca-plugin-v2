/*     */ package org.datacontract.schemas._2004._07.tricentis_distributionserver;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.datacontract.schemas._2004._07.tricentis.ArrayOfTestConfigurationParameter;
/*     */ import org.datacontract.schemas._2004._07.tricentis.RdpConfiguration;
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
/*     */ @XmlType(name="AgentInfo", propOrder={"agentError", "configuration", "id", "name", "rdpConfiguration", "state"})
/*     */ public class AgentInfo
/*     */ {
/*     */   @XmlElementRef(name="AgentError", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<AgentError> agentError;
/*     */   @XmlElementRef(name="Configuration", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<ArrayOfTestConfigurationParameter> configuration;
/*     */   @XmlElement(name="Id")
/*     */   protected String id;
/*     */   @XmlElementRef(name="Name", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<String> name;
/*     */   @XmlElementRef(name="RdpConfiguration", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface", type=JAXBElement.class, required=false)
/*     */   protected JAXBElement<RdpConfiguration> rdpConfiguration;
/*     */   @XmlElement(name="State")
/*     */   protected AgentState state;
/*     */   
/*     */   public JAXBElement<AgentError> getAgentError()
/*     */   {
/*  71 */     return this.agentError;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAgentError(JAXBElement<AgentError> value)
/*     */   {
/*  83 */     this.agentError = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<ArrayOfTestConfigurationParameter> getConfiguration()
/*     */   {
/*  95 */     return this.configuration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConfiguration(JAXBElement<ArrayOfTestConfigurationParameter> value)
/*     */   {
/* 107 */     this.configuration = value;
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
/* 119 */     return this.id;
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
/* 131 */     this.id = value;
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
/* 143 */     return this.name;
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
/* 155 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JAXBElement<RdpConfiguration> getRdpConfiguration()
/*     */   {
/* 167 */     return this.rdpConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRdpConfiguration(JAXBElement<RdpConfiguration> value)
/*     */   {
/* 179 */     this.rdpConfiguration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AgentState getState()
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
/*     */   public void setState(AgentState value)
/*     */   {
/* 203 */     this.state = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\AgentInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */