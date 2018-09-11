/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis.TestConfigurationParameterCollection;
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
/*    */ @XmlType(name="", propOrder={"getConfigurationParametersResult"})
/*    */ @XmlRootElement(name="GetConfigurationParametersResponse")
/*    */ public class GetConfigurationParametersResponse
/*    */ {
/*    */   @XmlElementRef(name="GetConfigurationParametersResult", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<TestConfigurationParameterCollection> getConfigurationParametersResult;
/*    */   
/*    */   public JAXBElement<TestConfigurationParameterCollection> getGetConfigurationParametersResult()
/*    */   {
/* 51 */     return this.getConfigurationParametersResult;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setGetConfigurationParametersResult(JAXBElement<TestConfigurationParameterCollection> value)
/*    */   {
/* 63 */     this.getConfigurationParametersResult = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\GetConfigurationParametersResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */