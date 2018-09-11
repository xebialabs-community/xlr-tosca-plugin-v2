/*    */ package org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data;
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
/*    */ @XmlType(name="ArrayOfMonitorDistributionEvent", namespace="http://schemas.datacontract.org/2004/07/Tricentis.DistributionServer.ServiceInterface.Data.Monitor", propOrder={"monitorDistributionEvent"})
/*    */ public class ArrayOfMonitorDistributionEvent
/*    */ {
/*    */   @XmlElement(name="MonitorDistributionEvent", nillable=true)
/*    */   protected List<MonitorDistributionEvent> monitorDistributionEvent;
/*    */   
/*    */   public List<MonitorDistributionEvent> getMonitorDistributionEvent()
/*    */   {
/* 63 */     if (this.monitorDistributionEvent == null) {
/* 64 */       this.monitorDistributionEvent = new ArrayList();
/*    */     }
/* 66 */     return this.monitorDistributionEvent;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\datacontract\schemas\_2004\_07\tricentis_distributionserver_serviceinterface_data\ArrayOfMonitorDistributionEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */