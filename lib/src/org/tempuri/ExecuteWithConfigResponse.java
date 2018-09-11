/*    */ package org.tempuri;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"executeWithConfigResult"})
/*    */ @XmlRootElement(name="ExecuteWithConfigResponse")
/*    */ public class ExecuteWithConfigResponse
/*    */ {
/*    */   @XmlElementRef(name="ExecuteWithConfigResult", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<String> executeWithConfigResult;
/*    */   
/*    */   public JAXBElement<String> getExecuteWithConfigResult()
/*    */   {
/* 50 */     return this.executeWithConfigResult;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setExecuteWithConfigResult(JAXBElement<String> value)
/*    */   {
/* 62 */     this.executeWithConfigResult = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\ExecuteWithConfigResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */