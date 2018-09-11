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
/*    */ @XmlType(name="", propOrder={"executeWithoutConfigResult"})
/*    */ @XmlRootElement(name="ExecuteWithoutConfigResponse")
/*    */ public class ExecuteWithoutConfigResponse
/*    */ {
/*    */   @XmlElementRef(name="ExecuteWithoutConfigResult", namespace="http://tempuri.org/", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<String> executeWithoutConfigResult;
/*    */   
/*    */   public JAXBElement<String> getExecuteWithoutConfigResult()
/*    */   {
/* 50 */     return this.executeWithoutConfigResult;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setExecuteWithoutConfigResult(JAXBElement<String> value)
/*    */   {
/* 62 */     this.executeWithoutConfigResult = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\ExecuteWithoutConfigResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */