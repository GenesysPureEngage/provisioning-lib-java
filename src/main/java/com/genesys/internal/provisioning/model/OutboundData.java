/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.35.2826
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-22T05:15:58.926Z")
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
   * Name of an outbound client 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of an outbound client ")
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
   * Get fromEmail
   * @return fromEmail
  **/
  @ApiModelProperty(value = "")
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
   * Get mailbox
   * @return mailbox
  **/
  @ApiModelProperty(value = "")
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
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
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
   * Get host
   * @return host
  **/
  @ApiModelProperty(value = "")
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
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
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
   * Get connectionSecurity
   * @return connectionSecurity
  **/
  @ApiModelProperty(value = "")
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
   * SMTP or IMAP 
   * @return type
  **/
  @ApiModelProperty(value = "SMTP or IMAP ")
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

