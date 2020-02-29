package com.DriveCam.Services;

public class IEventFileStreamingServiceProxy implements com.DriveCam.Services.IEventFileStreamingService {
  private String _endpoint = null;
  private com.DriveCam.Services.IEventFileStreamingService iEventFileStreamingService = null;
  
  public IEventFileStreamingServiceProxy() {
    _initIEventFileStreamingServiceProxy();
  }
  
  public IEventFileStreamingServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIEventFileStreamingServiceProxy();
  }
  
  private void _initIEventFileStreamingServiceProxy() {
    try {
      iEventFileStreamingService = (new com.DriveCam.Services.EventFileStreamingServiceLocator()).getBasicHttpBinding_IEventFileStreamingService();
      if (iEventFileStreamingService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iEventFileStreamingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iEventFileStreamingService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iEventFileStreamingService != null)
      ((javax.xml.rpc.Stub)iEventFileStreamingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.DriveCam.Services.IEventFileStreamingService getIEventFileStreamingService() {
    if (iEventFileStreamingService == null)
      _initIEventFileStreamingServiceProxy();
    return iEventFileStreamingService;
  }
  
  public com.DriveCam.Services.EventFileResponse getEventFileById(com.DriveCam.Services.EventFileRequest parameters) throws java.rmi.RemoteException{
    if (iEventFileStreamingService == null)
      _initIEventFileStreamingServiceProxy();
    return iEventFileStreamingService.getEventFileById(parameters);
  }
  
  
}