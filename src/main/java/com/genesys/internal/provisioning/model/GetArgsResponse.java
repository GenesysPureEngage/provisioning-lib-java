/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.57.3612
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
 * GetArgsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T12:30:27.286Z")
public class GetArgsResponse {
  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("cometEngine")
  private String cometEngine = null;

  @SerializedName("asyncIOEnabled")
  private Boolean asyncIOEnabled = null;

  public GetArgsResponse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Current session ID
   * @return sessionId
  **/
  @ApiModelProperty(value = "Current session ID")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public GetArgsResponse cometEngine(String cometEngine) {
    this.cometEngine = cometEngine;
    return this;
  }

   /**
   * Name of cometEngine
   * @return cometEngine
  **/
  @ApiModelProperty(value = "Name of cometEngine")
  public String getCometEngine() {
    return cometEngine;
  }

  public void setCometEngine(String cometEngine) {
    this.cometEngine = cometEngine;
  }

  public GetArgsResponse asyncIOEnabled(Boolean asyncIOEnabled) {
    this.asyncIOEnabled = asyncIOEnabled;
    return this;
  }

   /**
   * Returns is enabled asyncIO
   * @return asyncIOEnabled
  **/
  @ApiModelProperty(value = "Returns is enabled asyncIO")
  public Boolean isAsyncIOEnabled() {
    return asyncIOEnabled;
  }

  public void setAsyncIOEnabled(Boolean asyncIOEnabled) {
    this.asyncIOEnabled = asyncIOEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetArgsResponse getArgsResponse = (GetArgsResponse) o;
    return Objects.equals(this.sessionId, getArgsResponse.sessionId) &&
        Objects.equals(this.cometEngine, getArgsResponse.cometEngine) &&
        Objects.equals(this.asyncIOEnabled, getArgsResponse.asyncIOEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, cometEngine, asyncIOEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetArgsResponse {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    cometEngine: ").append(toIndentedString(cometEngine)).append("\n");
    sb.append("    asyncIOEnabled: ").append(toIndentedString(asyncIOEnabled)).append("\n");
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

