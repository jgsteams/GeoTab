/**
 * EventFileStreamingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DriveCam.Services;

public class EventFileStreamingServiceLocator extends org.apache.axis.client.Service implements com.DriveCam.Services.EventFileStreamingService {

    public EventFileStreamingServiceLocator() {
    }


    public EventFileStreamingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EventFileStreamingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IEventFileStreamingService
    private java.lang.String BasicHttpBinding_IEventFileStreamingService_address = "https://services-sd02.drivecam.com/DCSubmission/EventFileStreamingService.svc";

    public java.lang.String getBasicHttpBinding_IEventFileStreamingServiceAddress() {
        return BasicHttpBinding_IEventFileStreamingService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IEventFileStreamingServiceWSDDServiceName = "BasicHttpBinding_IEventFileStreamingService";

    public java.lang.String getBasicHttpBinding_IEventFileStreamingServiceWSDDServiceName() {
        return BasicHttpBinding_IEventFileStreamingServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IEventFileStreamingServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IEventFileStreamingServiceWSDDServiceName = name;
    }

    public com.DriveCam.Services.IEventFileStreamingService getBasicHttpBinding_IEventFileStreamingService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IEventFileStreamingService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IEventFileStreamingService(endpoint);
    }

    public com.DriveCam.Services.IEventFileStreamingService getBasicHttpBinding_IEventFileStreamingService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.DriveCam.Services.BasicHttpBinding_IEventFileStreamingServiceStub _stub = new com.DriveCam.Services.BasicHttpBinding_IEventFileStreamingServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IEventFileStreamingServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IEventFileStreamingServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IEventFileStreamingService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.DriveCam.Services.IEventFileStreamingService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.DriveCam.Services.BasicHttpBinding_IEventFileStreamingServiceStub _stub = new com.DriveCam.Services.BasicHttpBinding_IEventFileStreamingServiceStub(new java.net.URL(BasicHttpBinding_IEventFileStreamingService_address), this);
                _stub.setPortName(getBasicHttpBinding_IEventFileStreamingServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IEventFileStreamingService".equals(inputPortName)) {
            return getBasicHttpBinding_IEventFileStreamingService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DriveCam.com/Services", "EventFileStreamingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DriveCam.com/Services", "BasicHttpBinding_IEventFileStreamingService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IEventFileStreamingService".equals(portName)) {
            setBasicHttpBinding_IEventFileStreamingServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
