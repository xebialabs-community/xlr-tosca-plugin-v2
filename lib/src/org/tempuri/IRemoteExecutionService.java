package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name="IRemoteExecutionService", targetNamespace="http://tempuri.org/")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, org.datacontract.schemas._2004._07.toscacontinuousintegration_toscaciremoteexecutionservice.ObjectFactory.class, ObjectFactory.class})
public abstract interface IRemoteExecutionService
{
  @WebMethod(operationName="ExecuteWithConfig", action="http://tempuri.org/IRemoteExecutionService/ExecuteWithConfig")
  @WebResult(name="ExecuteWithConfigResult", targetNamespace="http://tempuri.org/")
  @RequestWrapper(localName="ExecuteWithConfig", targetNamespace="http://tempuri.org/", className="org.tempuri.ExecuteWithConfig")
  @ResponseWrapper(localName="ExecuteWithConfigResponse", targetNamespace="http://tempuri.org/", className="org.tempuri.ExecuteWithConfigResponse")
  @Action(input="http://tempuri.org/IRemoteExecutionService/ExecuteWithConfig", output="http://tempuri.org/IRemoteExecutionService/ExecuteWithConfigResponse", fault={@javax.xml.ws.FaultAction(className=IRemoteExecutionServiceExecuteWithConfigServiceFaultFaultFaultMessage.class, value="http://tempuri.org/IRemoteExecutionService/ExecuteWithConfigServiceFaultFault")})
  public abstract String executeWithConfig(@WebParam(name="usernameHash", targetNamespace="http://tempuri.org/") String paramString1, @WebParam(name="passwordHash", targetNamespace="http://tempuri.org/") String paramString2, @WebParam(name="config", targetNamespace="http://tempuri.org/") String paramString3, @WebParam(name="resultType", targetNamespace="http://tempuri.org/") String paramString4)
    throws IRemoteExecutionServiceExecuteWithConfigServiceFaultFaultFaultMessage;
  
  @WebMethod(operationName="ExecuteWithoutConfig", action="http://tempuri.org/IRemoteExecutionService/ExecuteWithoutConfig")
  @WebResult(name="ExecuteWithoutConfigResult", targetNamespace="http://tempuri.org/")
  @RequestWrapper(localName="ExecuteWithoutConfig", targetNamespace="http://tempuri.org/", className="org.tempuri.ExecuteWithoutConfig")
  @ResponseWrapper(localName="ExecuteWithoutConfigResponse", targetNamespace="http://tempuri.org/", className="org.tempuri.ExecuteWithoutConfigResponse")
  @Action(input="http://tempuri.org/IRemoteExecutionService/ExecuteWithoutConfig", output="http://tempuri.org/IRemoteExecutionService/ExecuteWithoutConfigResponse", fault={@javax.xml.ws.FaultAction(className=IRemoteExecutionServiceExecuteWithoutConfigServiceFaultFaultFaultMessage.class, value="http://tempuri.org/IRemoteExecutionService/ExecuteWithoutConfigServiceFaultFault")})
  public abstract String executeWithoutConfig(@WebParam(name="usernameHash", targetNamespace="http://tempuri.org/") String paramString1, @WebParam(name="passwordHash", targetNamespace="http://tempuri.org/") String paramString2, @WebParam(name="resultType", targetNamespace="http://tempuri.org/") String paramString3)
    throws IRemoteExecutionServiceExecuteWithoutConfigServiceFaultFaultFaultMessage;
}


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\IRemoteExecutionService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */