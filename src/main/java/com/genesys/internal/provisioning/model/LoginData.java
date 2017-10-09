/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.877
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
 * LoginData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T18:04:15.270Z")
public class LoginData {
  @SerializedName("domain_username")
  private String domainUsername = "domain.com\\login";

  @SerializedName("password")
  private String password = "password";

  public LoginData domainUsername(String domainUsername) {
    this.domainUsername = domainUsername;
    return this;
  }

   /**
   * User unique login in form: domain.com\\login 
   * @return domainUsername
  **/
  @ApiModelProperty(required = true, value = "User unique login in form: domain.com\\login ")
  public String getDomainUsername() {
    return domainUsername;
  }

  public void setDomainUsername(String domainUsername) {
    this.domainUsername = domainUsername;
  }

  public LoginData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password as plain text. 
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password as plain text. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginData loginData = (LoginData) o;
    return Objects.equals(this.domainUsername, loginData.domainUsername) &&
        Objects.equals(this.password, loginData.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainUsername, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginData {\n");
    
    sb.append("    domainUsername: ").append(toIndentedString(domainUsername)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

