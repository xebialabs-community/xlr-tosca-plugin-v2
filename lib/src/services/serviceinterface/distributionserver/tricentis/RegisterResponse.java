/*    */ package services.serviceinterface.distributionserver.tricentis;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.RegistrationResponse;
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
/*    */ @XmlType(name="", propOrder={"registerResult"})
/*    */ @XmlRootElement(name="RegisterResponse")
/*    */ public class RegisterResponse
/*    */ {
/*    */   @XmlElementRef(name="RegisterResult", namespace="Tricentis.DistributionServer.ServiceInterface.Services", type=JAXBElement.class, required=false)
/*    */   protected JAXBElement<RegistrationResponse> registerResult;
/*    */   
/*    */   public JAXBElement<RegistrationResponse> getRegisterResult()
/*    */   {
/* 51 */     return this.registerResult;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setRegisterResult(JAXBElement<RegistrationResponse> value)
/*    */   {
/* 63 */     this.registerResult = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\services\serviceinterface\distributionserver\tricentis\RegisterResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */