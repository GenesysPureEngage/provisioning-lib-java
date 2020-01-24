/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.75.4131
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InboundData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-13T18:04:39.943Z")
public class InboundData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("maxMessageSize")
  private Integer maxMessageSize = null;

  @SerializedName("mailbox")
  private String mailbox = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("connectionSecurity")
  private String connectionSecurity = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  public InboundData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of an inbound corporate mailbox. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of an inbound corporate mailbox. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InboundData maxMessageSize(Integer maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
    return this;
  }

   /**
   * The maximum size (in MB) of an incoming message. 
   * @return maxMessageSize
  **/
  @ApiModelProperty(value = "The maximum size (in MB) of an incoming message. ")
  public Integer getMaxMessageSize() {
    return maxMessageSize;
  }

  public void setMaxMessageSize(Integer maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
  }

  public InboundData mailbox(String mailbox) {
    this.mailbox = mailbox;
    return this;
  }

   /**
   * The login name associated with the POP/IMAP account. 
   * @return mailbox
  **/
  @ApiModelProperty(value = "The login name associated with the POP/IMAP account. ")
  public String getMailbox() {
    return mailbox;
  }

  public void setMailbox(String mailbox) {
    this.mailbox = mailbox;
  }

  public InboundData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password associated with this account. 
   * @return password
  **/
  @ApiModelProperty(value = "The password associated with this account. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public InboundData host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The host name or IP address of the corporate email server on which the account resides. 
   * @return host
  **/
  @ApiModelProperty(value = "The host name or IP address of the corporate email server on which the account resides. ")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public InboundData port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port number for connecting to the corporate email server. 
   * @return port
  **/
  @ApiModelProperty(value = "The port number for connecting to the corporate email server. ")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public InboundData connectionSecurity(String connectionSecurity) {
    this.connectionSecurity = connectionSecurity;
    return this;
  }

   /**
   * Specifies how the connection to the corporate email server is secured. If set to &#x60;start-tls&#x60;, the Provisioning API uses the STARTTLS command (if supported by the server) to switch to a TLS-protected connection before issuing any login commands. If a TLS connection is not available, a plain-text connection is used. If set to &#x60;start-tls-required&#x60;, the API uses the STARTTLS command and if a TLS connection is not available, the connection is aborted. If set to &#x60;ssl-tls&#x60;, the API uses Secure Sockets Layer (SSL) encryption when connecting to the corporate email server. 
   * @return connectionSecurity
  **/
  @ApiModelProperty(value = "Specifies how the connection to the corporate email server is secured. If set to `start-tls`, the Provisioning API uses the STARTTLS command (if supported by the server) to switch to a TLS-protected connection before issuing any login commands. If a TLS connection is not available, a plain-text connection is used. If set to `start-tls-required`, the API uses the STARTTLS command and if a TLS connection is not available, the connection is aborted. If set to `ssl-tls`, the API uses Secure Sockets Layer (SSL) encryption when connecting to the corporate email server. ")
  public String getConnectionSecurity() {
    return connectionSecurity;
  }

  public void setConnectionSecurity(String connectionSecurity) {
    this.connectionSecurity = connectionSecurity;
  }

  public InboundData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The protocol used to retrieve incoming messages from the corporate email server. Possible values are &#x60;POP3&#x60;, &#x60;IMAP&#x60;, or &#x60;EWS&#x60;. 
   * @return type
  **/
  @ApiModelProperty(value = "The protocol used to retrieve incoming messages from the corporate email server. Possible values are `POP3`, `IMAP`, or `EWS`. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InboundData enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Specifies if the inbound client is enabled. 
   * @return enabled
  **/
  @ApiModelProperty(value = "Specifies if the inbound client is enabled. ")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundData inboundData = (InboundData) o;
    return Objects.equals(this.name, inboundData.name) &&
        Objects.equals(this.maxMessageSize, inboundData.maxMessageSize) &&
        Objects.equals(this.mailbox, inboundData.mailbox) &&
        Objects.equals(this.password, inboundData.password) &&
        Objects.equals(this.host, inboundData.host) &&
        Objects.equals(this.port, inboundData.port) &&
        Objects.equals(this.connectionSecurity, inboundData.connectionSecurity) &&
        Objects.equals(this.type, inboundData.type) &&
        Objects.equals(this.enabled, inboundData.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, maxMessageSize, mailbox, password, host, port, connectionSecurity, type, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxMessageSize: ").append(toIndentedString(maxMessageSize)).append("\n");
    sb.append("    mailbox: ").append(toIndentedString(mailbox)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    connectionSecurity: ").append(toIndentedString(connectionSecurity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

