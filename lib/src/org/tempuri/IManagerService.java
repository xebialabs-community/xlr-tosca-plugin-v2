package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.tricentis.TestConfigurationParameterCollection;
import org.datacontract.schemas._2004._07.tricentis_distributionserver.ArrayOfAgentInfo;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.CancelCiTestEventsRequest;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DeleteResultRequest;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeCiTestEventsRequest;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeCloudRequest;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.DistributeRequest;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.GetCloudResultRequest;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.GetCloudResultResponse;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsRequest;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.PollCiTestEventsResultsResponse;
import org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.RegistrationResponse;

@WebService(name="IManagerService", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, org.datacontract.schemas._2004._07.system.ObjectFactory.class, org.datacontract.schemas._2004._07.tricentis.ObjectFactory.class, org.datacontract.schemas._2004._07.tricentis_distributionserver.ObjectFactory.class, org.datacontract.schemas._2004._07.tricentis_distributionserver_serviceinterface_data.ObjectFactory.class, services.serviceinterface.distributionserver.tricentis.ObjectFactory.class})
public abstract interface IManagerService
{
  @WebMethod(operationName="CancelCiTestEvents", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/CancelCiTestEvents")
  @RequestWrapper(localName="CancelCiTestEvents", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.CancelCiTestEvents")
  @ResponseWrapper(localName="CancelCiTestEventsResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.CancelCiTestEventsResponse")
  public abstract void cancelCiTestEvents(@WebParam(name="cancelCiTestEventsRequest", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") CancelCiTestEventsRequest paramCancelCiTestEventsRequest);
  
  @WebMethod(operationName="DeleteResult", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/DeleteResult")
  @RequestWrapper(localName="DeleteResult", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DeleteResult")
  @ResponseWrapper(localName="DeleteResultResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DeleteResultResponse")
  public abstract void deleteResult(@WebParam(name="deleteResultRequest", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") DeleteResultRequest paramDeleteResultRequest);
  
  @WebMethod(operationName="Distribute", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/Distribute")
  @RequestWrapper(localName="Distribute", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.Distribute")
  @ResponseWrapper(localName="DistributeResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DistributeResponse")
  public abstract void distribute(@WebParam(name="distributeRequest", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") DistributeRequest paramDistributeRequest);
  
  @WebMethod(operationName="DistributeCiTestEvents", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/DistributeCiTestEvents")
  @RequestWrapper(localName="DistributeCiTestEvents", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DistributeCiTestEvents")
  @ResponseWrapper(localName="DistributeCiTestEventsResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DistributeCiTestEventsResponse")
  public abstract void distributeCiTestEvents(@WebParam(name="distributeCiTestEventsRequest", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") DistributeCiTestEventsRequest paramDistributeCiTestEventsRequest);
  
  @WebMethod(operationName="DistributeInCloud", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/DistributeInCloud")
  @RequestWrapper(localName="DistributeInCloud", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DistributeInCloud")
  @ResponseWrapper(localName="DistributeInCloudResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DistributeInCloudResponse")
  public abstract void distributeInCloud(@WebParam(name="distributeCloudRequest", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") DistributeCloudRequest paramDistributeCloudRequest);
  
  @WebMethod(operationName="DistributeOnTestbirds", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/DistributeOnTestbirds")
  @RequestWrapper(localName="DistributeOnTestbirds", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DistributeOnTestbirds")
  @ResponseWrapper(localName="DistributeOnTestbirdsResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.DistributeOnTestbirdsResponse")
  public abstract void distributeOnTestbirds(@WebParam(name="distributeCloudRequest", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") DistributeCloudRequest paramDistributeCloudRequest);
  
  @WebMethod(operationName="GetAgents", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/GetAgents")
  @WebResult(name="GetAgentsResult", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services")
  @RequestWrapper(localName="GetAgents", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.GetAgents")
  @ResponseWrapper(localName="GetAgentsResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.GetAgentsResponse")
  public abstract ArrayOfAgentInfo getAgents();
  
  @WebMethod(operationName="GetConfigurationParameters", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/GetConfigurationParameters")
  @WebResult(name="GetConfigurationParametersResult", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services")
  @RequestWrapper(localName="GetConfigurationParameters", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.GetConfigurationParameters")
  @ResponseWrapper(localName="GetConfigurationParametersResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.GetConfigurationParametersResponse")
  public abstract TestConfigurationParameterCollection getConfigurationParameters();
  
  @WebMethod(operationName="GetCloudResultContainer", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/GetCloudResultContainer")
  @WebResult(name="GetCloudResultContainerResult", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services")
  @RequestWrapper(localName="GetCloudResultContainer", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.GetCloudResultContainer")
  @ResponseWrapper(localName="GetCloudResultContainerResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.GetCloudResultContainerResponse")
  public abstract GetCloudResultResponse getCloudResultContainer(@WebParam(name="eventId", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") GetCloudResultRequest paramGetCloudResultRequest);
  
  @WebMethod(operationName="PollCiTestEventsResults", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/PollCiTestEventsResults")
  @WebResult(name="PollCiTestEventsResultsResult", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services")
  @RequestWrapper(localName="PollCiTestEventsResults", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.PollCiTestEventsResults")
  @ResponseWrapper(localName="PollCiTestEventsResultsResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.PollCiTestEventsResultsResponse")
  public abstract PollCiTestEventsResultsResponse pollCiTestEventsResults(@WebParam(name="pollCiTestEventsResultsRequest", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") PollCiTestEventsResultsRequest paramPollCiTestEventsResultsRequest);
  
  @WebMethod(operationName="Register", action="Tricentis.DistributionServer.ServiceInterface.Services/IManagerService/Register")
  @WebResult(name="RegisterResult", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services")
  @RequestWrapper(localName="Register", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.Register")
  @ResponseWrapper(localName="RegisterResponse", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services", className="services.serviceinterface.distributionserver.tricentis.RegisterResponse")
  public abstract RegistrationResponse register(@WebParam(name="ciClientId", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") String paramString1, @WebParam(name="ldapString", targetNamespace="Tricentis.DistributionServer.ServiceInterface.Services") String paramString2);
}


/* Location:              C:\Users\timjf\workspace\xebialabs\plugin-dev\tosca\ToscaCIJavaClient.jar!\org\tempuri\IManagerService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */