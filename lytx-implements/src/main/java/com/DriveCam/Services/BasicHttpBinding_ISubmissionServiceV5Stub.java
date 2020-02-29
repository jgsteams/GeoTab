/**
 * BasicHttpBinding_ISubmissionServiceV5Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DriveCam.Services;

public class BasicHttpBinding_ISubmissionServiceV5Stub extends org.apache.axis.client.Stub implements com.DriveCam.Contracts.ISubmissionServiceV5 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "PingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "LoginResponse"));
        oper.setReturnClass(com.DriveCam.Classes.LoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "LoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoginCompany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "companyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "LoginResponse"));
        oper.setReturnClass(com.DriveCam.Classes.LoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "LoginCompanyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmitDriverDispatchLogs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "dispatchEntries"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "SubmitDriverDispatchLogsResponse"));
        oper.setReturnClass(com.DriveCam.Classes.SubmitDriverDispatchLogsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "SubmitDriverDispatchLogsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubmissionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "submissionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetSubmissionStatusResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetSubmissionStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetSubmissionStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubmissionResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "submissionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetSubmissionResultsResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetSubmissionResultsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetSubmissionResultsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVehicles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getVehiclesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehiclesRequest"), com.DriveCam.Classes.GetVehiclesRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehiclesResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetVehiclesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetVehiclesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVehicleTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getVehicleTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ExistingSessionRequest"), com.DriveCam.Classes.ExistingSessionRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehicleTypesResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetVehicleTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetVehicleTypesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVehicleStatuses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getVehicleStatusesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ExistingSessionRequest"), com.DriveCam.Classes.ExistingSessionRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehicleStatusesResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetVehicleStatusesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetVehicleStatusesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getEventTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ExistingSessionRequest"), com.DriveCam.Classes.ExistingSessionRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetEventTypesResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetEventTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetEventTypesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventStatuses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getEventStatusesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ExistingSessionRequest"), com.DriveCam.Classes.ExistingSessionRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetEventStatusesResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetEventStatusesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetEventStatusesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBehaviors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getBehaviorsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ExistingSessionRequest"), com.DriveCam.Classes.ExistingSessionRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetBehaviorsResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetBehaviorsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetBehaviorsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetUsersRequest"), com.DriveCam.Classes.GetUsersRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetUsersResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetUsersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGroupsById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getGroupsByIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetGroupsByIdRequest"), com.DriveCam.Classes.GetGroupsByIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetGroupsResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetGroupsByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGroupsByPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getGroupsByFullPathRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetGroupsByFullPathRequest"), com.DriveCam.Classes.GetGroupsByFullPathRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetGroupsResponse"));
        oper.setReturnClass(com.DriveCam.Classes.GetGroupsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetGroupsByPathResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventsByLastUpdateDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "getEventsByLastUpdateDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetEventsByLastUpdateDateRequest"), com.DriveCam.Classes.GetEventsByLastUpdateDateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DriveCam.HindSight.Messaging.Messages.MessageClasses.Api.GetEvents_V5", "GetEventsResponse"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api_GetEvents_V5.GetEventsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetEventsByLastUpdateDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

    }

    public BasicHttpBinding_ISubmissionServiceV5Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ISubmissionServiceV5Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ISubmissionServiceV5Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes/", "ArrayOfEventsInfoV5");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventsInfoV5[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes/", "EventsInfoV5");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes/", "EventsInfoV5");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes/", "EventsInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes/", "EventsInfoV3");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventsInfoV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes/", "EventsInfoV4");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventsInfoV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes/", "EventsInfoV5");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventsInfoV5.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfBehavior");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.Behavior[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "Behavior");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "Behavior");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfEventStatus");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "EventStatus");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "EventStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfEventType");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "EventType");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "EventType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfGroupInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GroupInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GroupInfo");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GroupInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfNoteInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.NoteInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "NoteInfo");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "NoteInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfUserInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.UserInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "UserInfo");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "UserInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfVehicleInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.VehicleInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleInfo");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfVehicleStatus");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.VehicleStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleStatus");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ArrayOfVehicleType");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.VehicleType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleType");
            qName2 = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "Behavior");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.Behavior.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "EventStatus");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "EventType");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.EventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "ExistingSessionRequest");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.ExistingSessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetBehaviorsResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetBehaviorsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetEventsByLastUpdateDateRequest");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetEventsByLastUpdateDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetEventStatusesResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetEventStatusesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetEventTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetEventTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetGroupsByFullPathRequest");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetGroupsByFullPathRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetGroupsByIdRequest");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetGroupsByIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetGroupsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetSubmissionResultsResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetSubmissionResultsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetSubmissionStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetSubmissionStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetUsersRequest");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehiclesRequest");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetVehiclesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehiclesResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetVehiclesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehicleStatusesResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetVehicleStatusesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehicleTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GetVehicleTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GroupInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.GroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "LoginResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "NoteInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.NoteInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "SubmitDriverDispatchLogsResponse");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.SubmitDriverDispatchLogsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "UserInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleInfo");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.VehicleInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleStatus");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.VehicleStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleType");
            cachedSerQNames.add(qName);
            cls = com.DriveCam.Classes.VehicleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DriveCam.HindSight.Messaging.Messages.MessageClasses.Api.GetEvents_V5", "GetEventsResponse");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api_GetEvents_V5.GetEventsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DriveCam.HindSight.Messaging.Messages.MessageClasses.Api", "ArrayOfEventBehavior");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api.EventBehavior[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DriveCam.HindSight.Messaging.Messages.MessageClasses.Api", "EventBehavior");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DriveCam.HindSight.Messaging.Messages.MessageClasses.Api", "EventBehavior");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DriveCam.HindSight.Messaging.Messages.MessageClasses.Api", "EventBehavior");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api.EventBehavior.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String ping() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/Ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.LoginResponse login(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/Login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "Login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.LoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.LoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.LoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.LoginResponse loginCompany(java.lang.String userName, java.lang.String password, java.lang.Long companyId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/LoginCompany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "LoginCompany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, companyId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.LoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.LoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.LoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.SubmitDriverDispatchLogsResponse submitDriverDispatchLogs(java.lang.String sessionId, java.lang.String dispatchEntries) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/SubmitDriverDispatchLogs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "SubmitDriverDispatchLogs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, dispatchEntries});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.SubmitDriverDispatchLogsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.SubmitDriverDispatchLogsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.SubmitDriverDispatchLogsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetSubmissionStatusResponse getSubmissionStatus(java.lang.String sessionId, java.lang.Long submissionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetSubmissionStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetSubmissionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, submissionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetSubmissionStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetSubmissionStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetSubmissionStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetSubmissionResultsResponse getSubmissionResults(java.lang.String sessionId, java.lang.Long submissionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetSubmissionResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetSubmissionResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, submissionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetSubmissionResultsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetSubmissionResultsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetSubmissionResultsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetVehiclesResponse getVehicles(com.DriveCam.Classes.GetVehiclesRequest getVehiclesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetVehicles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetVehicles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getVehiclesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetVehiclesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetVehiclesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetVehiclesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetVehicleTypesResponse getVehicleTypes(com.DriveCam.Classes.ExistingSessionRequest getVehicleTypesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetVehicleTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetVehicleTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getVehicleTypesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetVehicleTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetVehicleTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetVehicleTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetVehicleStatusesResponse getVehicleStatuses(com.DriveCam.Classes.ExistingSessionRequest getVehicleStatusesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetVehicleStatuses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetVehicleStatuses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getVehicleStatusesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetVehicleStatusesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetVehicleStatusesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetVehicleStatusesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetEventTypesResponse getEventTypes(com.DriveCam.Classes.ExistingSessionRequest getEventTypesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetEventTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetEventTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEventTypesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetEventTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetEventTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetEventTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetEventStatusesResponse getEventStatuses(com.DriveCam.Classes.ExistingSessionRequest getEventStatusesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetEventStatuses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetEventStatuses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEventStatusesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetEventStatusesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetEventStatusesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetEventStatusesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetBehaviorsResponse getBehaviors(com.DriveCam.Classes.ExistingSessionRequest getBehaviorsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetBehaviors");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetBehaviors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getBehaviorsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetBehaviorsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetBehaviorsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetBehaviorsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetUsersResponse getUsers(com.DriveCam.Classes.GetUsersRequest getUsersRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUsersRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetGroupsResponse getGroupsById(com.DriveCam.Classes.GetGroupsByIdRequest getGroupsByIdRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetGroupsById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetGroupsById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getGroupsByIdRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetGroupsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetGroupsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.DriveCam.Classes.GetGroupsResponse getGroupsByPath(com.DriveCam.Classes.GetGroupsByFullPathRequest getGroupsByFullPathRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetGroupsByPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetGroupsByPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getGroupsByFullPathRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.DriveCam.Classes.GetGroupsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.DriveCam.Classes.GetGroupsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.DriveCam.Classes.GetGroupsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api_GetEvents_V5.GetEventsResponse getEventsByLastUpdateDate(com.DriveCam.Classes.GetEventsByLastUpdateDateRequest getEventsByLastUpdateDateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://DriveCam.com/Contracts/ISubmissionServiceV5/GetEventsByLastUpdateDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://DriveCam.com/Contracts", "GetEventsByLastUpdateDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEventsByLastUpdateDateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api_GetEvents_V5.GetEventsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api_GetEvents_V5.GetEventsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.DriveCam_HindSight_Messaging_Messages_MessageClasses_Api_GetEvents_V5.GetEventsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
