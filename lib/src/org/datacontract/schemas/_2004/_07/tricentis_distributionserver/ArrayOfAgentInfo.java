/*    */ package org.datacontract.schemas._2004._07.tricentis_distributionserver;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlType;
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
/*    */ @XmlType(name="ArrayOfAgentInfo", propOrder={"agentInfo"})
/*    */ public class ArrayOfAgentInfo
/*    */ {
/*    */   @XmlElement(name="AgentInfo", nillable=true)
/*    */   protected List<AgentInfo> agentInfo;
/*    */   
/*    */   public List<AgentInfo> getAgentInfo()
/*    */   {
/* 63 */     if (this.agentInfo == null) {
/* 64 */       this.agentInfo = new ArrayList();
/*    */     }
/* 66 */     return this.agentInfo;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver\ArrayOfAgentInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */