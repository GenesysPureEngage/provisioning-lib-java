/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.67.3932
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
 * OutboundData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-07T11:07:15.242Z")
public class OutboundData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("fromEmail")
  private String fromEmail = null;

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

  public OutboundData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of an outbound corporate mailbox. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of an outbound corporate mailbox. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutboundData fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * The email address associated with this account. 
   * @return fromEmail
  **/
  @ApiModelProperty(value = "The email address associated with this account. ")
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public OutboundData mailbox(String mailbox) {
    this.mailbox = mailbox;
    return this;
  }

   /**
   * The name used to log in to the corporate email server. 
   * @return mailbox
  **/
  @ApiModelProperty(value = "The name used to log in to the corporate email server. ")
  public String getMailbox() {
    return mailbox;
  }

  public void setMailbox(String mailbox) {
    this.mailbox = mailbox;
  }

  public OutboundData password(String password) {
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

  public OutboundData host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The name of the corporate SMTP server. 
   * @return host
  **/
  @ApiModelProperty(value = "The name of the corporate SMTP server. ")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public OutboundData port(Integer port) {
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

  public OutboundData connectionSecurity(String connectionSecurity) {
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

  public OutboundData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The outbound email type. Possible values: &#x60;SMTP&#x60; or &#x60;IMAP&#x60;. 
   * @return type
  **/
  @ApiModelProperty(value = "The outbound email type. Possible values: `SMTP` or `IMAP`. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundData outboundData = (OutboundData) o;
    return Objects.equals(this.name, outboundData.name) &&
        Objects.equals(this.fromEmail, outboundData.fromEmail) &&
        Objects.equals(this.mailbox, outboundData.mailbox) &&
        Objects.equals(this.password, outboundData.password) &&
        Objects.equals(this.host, outboundData.host) &&
        Objects.equals(this.port, outboundData.port) &&
        Objects.equals(this.connectionSecurity, outboundData.connectionSecurity) &&
        Objects.equals(this.type, outboundData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fromEmail, mailbox, password, host, port, connectionSecurity, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    mailbox: ").append(toIndentedString(mailbox)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    connectionSecurity: ").append(toIndentedString(connectionSecurity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

