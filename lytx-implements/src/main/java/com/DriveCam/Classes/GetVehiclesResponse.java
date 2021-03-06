/**
 * GetVehiclesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DriveCam.Classes;

public class GetVehiclesResponse  implements java.io.Serializable {
    private java.lang.Boolean error;

    private java.lang.String message;

    private com.DriveCam.Classes.VehicleInfo[] vehicles;

    public GetVehiclesResponse() {
    }

    public GetVehiclesResponse(
           java.lang.Boolean error,
           java.lang.String message,
           com.DriveCam.Classes.VehicleInfo[] vehicles) {
           this.error = error;
           this.message = message;
           this.vehicles = vehicles;
    }


    /**
     * Gets the error value for this GetVehiclesResponse.
     * 
     * @return error
     */
    public java.lang.Boolean getError() {
        return error;
    }


    /**
     * Sets the error value for this GetVehiclesResponse.
     * 
     * @param error
     */
    public void setError(java.lang.Boolean error) {
        this.error = error;
    }


    /**
     * Gets the message value for this GetVehiclesResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetVehiclesResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the vehicles value for this GetVehiclesResponse.
     * 
     * @return vehicles
     */
    public com.DriveCam.Classes.VehicleInfo[] getVehicles() {
        return vehicles;
    }


    /**
     * Sets the vehicles value for this GetVehiclesResponse.
     * 
     * @param vehicles
     */
    public void setVehicles(com.DriveCam.Classes.VehicleInfo[] vehicles) {
        this.vehicles = vehicles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVehiclesResponse)) return false;
        GetVehiclesResponse other = (GetVehiclesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.vehicles==null && other.getVehicles()==null) || 
             (this.vehicles!=null &&
              java.util.Arrays.equals(this.vehicles, other.getVehicles())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getVehicles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVehiclesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "GetVehiclesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "Vehicles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://DriveCam.com/Classes", "VehicleInfo"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
