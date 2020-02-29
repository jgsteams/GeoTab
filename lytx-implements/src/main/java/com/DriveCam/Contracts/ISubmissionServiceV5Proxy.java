package com.DriveCam.Contracts;

public class ISubmissionServiceV5Proxy implements com.DriveCam.Contracts.ISubmissionServiceV5 {
  private String _endpoint = null;
  private com.DriveCam.Contracts.ISubmissionServiceV5 iSubmissionServiceV5 = null;
  
  public ISubmissionServiceV5Proxy() {
    _initISubmissionServiceV5Proxy();
  }
  
  public ISubmissionServiceV5Proxy(String endpoint) {
    _endpoint = endpoint;
    _initISubmissionServiceV5Proxy();
  }
  
  private void _initISubmissionServiceV5Proxy() {
    try {
      iSubmissionServiceV5 = (new com.DriveCam.Services.SubmissionServiceV5Locator()).getBasicHttpBinding_ISubmissionServiceV5();
      if (iSubmissionServiceV5 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iSubmissionServiceV5)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iSubmissionServiceV5)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iSubmissionServiceV5 != null)
      ((javax.xml.rpc.Stub)iSubmissionServiceV5)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.DriveCam.Contracts.ISubmissionServiceV5 getISubmissionServiceV5() {
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5;
  }
  
  public java.lang.String ping() throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.ping();
  }
  
  /*
  public com.DriveCam.Classes.LoginResponse login(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.login(userName, password);
  }
  
  public com.DriveCam.Classes.LoginResponse loginCompany(java.lang.String userName, java.lang.String password, java.lang.Long companyId) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.loginCompany(userName, password, companyId);
  }
  
  public com.DriveCam.Classes.SubmitDriverDispatchLogsResponse submitDriverDispatchLogs(java.lang.String sessionId, java.lang.String dispatchEntries) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.submitDriverDispatchLogs(sessionId, dispatchEntries);
  }
  
  public com.DriveCam.Classes.GetSubmissionStatusResponse getSubmissionStatus(java.lang.String sessionId, java.lang.Long submissionId) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getSubmissionStatus(sessionId, submissionId);
  }
  
  public com.DriveCam.Classes.GetSubmissionResultsResponse getSubmissionResults(java.lang.String sessionId, java.lang.Long submissionId) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getSubmissionResults(sessionId, submissionId);
  }
  
  public com.DriveCam.Classes.GetVehiclesResponse getVehicles(com.DriveCam.Classes.GetVehiclesRequest getVehiclesRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getVehicles(getVehiclesRequest);
  }
  
  public com.DriveCam.Classes.GetVehicleTypesResponse getVehicleTypes(com.DriveCam.Classes.ExistingSessionRequest getVehicleTypesRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getVehicleTypes(getVehicleTypesRequest);
  }
  
  public com.DriveCam.Classes.GetVehicleStatusesResponse getVehicleStatuses(com.DriveCam.Classes.ExistingSessionRequest getVehicleStatusesRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getVehicleStatuses(getVehicleStatusesRequest);
  }
  
  public com.DriveCam.Classes.GetEventTypesResponse getEventTypes(com.DriveCam.Classes.ExistingSessionRequest getEventTypesRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getEventTypes(getEventTypesRequest);
  }
  
  public com.DriveCam.Classes.GetEventStatusesResponse getEventStatuses(com.DriveCam.Classes.ExistingSessionRequest getEventStatusesRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getEventStatuses(getEventStatusesRequest);
  }
  
  public com.DriveCam.Classes.GetBehaviorsResponse getBehaviors(com.DriveCam.Classes.ExistingSessionRequest getBehaviorsRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getBehaviors(getBehaviorsRequest);
  }
  
  public com.DriveCam.Classes.GetUsersResponse getUsers(com.DriveCam.Classes.GetUsersRequest getUsersRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getUsers(getUsersRequest);
  }
  
  public com.DriveCam.Classes.GetGroupsResponse getGroupsById(com.DriveCam.Classes.GetGroupsByIdRequest getGroupsByIdRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getGroupsById(getGroupsByIdRequest);
  }
  
  public com.DriveCam.Classes.GetGroupsResponse getGroupsByPath(com.DriveCam.Classes.GetGroupsByFullPathRequest getGroupsByFullPathRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getGroupsByPath(getGroupsByFullPathRequest);
  }
  
  public org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api_GetEvents_V5.GetEventsResponse getEventsByLastUpdateDate(com.DriveCam.Classes.GetEventsByLastUpdateDateRequest getEventsByLastUpdateDateRequest) throws java.rmi.RemoteException{
    if (iSubmissionServiceV5 == null)
      _initISubmissionServiceV5Proxy();
    return iSubmissionServiceV5.getEventsByLastUpdateDate(getEventsByLastUpdateDateRequest);
  }
  */
  
}