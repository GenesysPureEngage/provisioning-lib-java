/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.85.4562
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
 * OptionsGetResponseSuccessData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-02T18:40:27.784Z")
public class OptionsGetResponseSuccessData {
  @SerializedName("options")
  private Object options = null;

  @SerializedName("cmeAppName")
  private String cmeAppName = null;

  @SerializedName("cmeAppDBID")
  private String cmeAppDBID = null;

  public OptionsGetResponseSuccessData options(Object options) {
    this.options = options;
    return this;
  }

   /**
   * Sections, keys and values of CloudCluster/Options.
   * @return options
  **/
  @ApiModelProperty(value = "Sections, keys and values of CloudCluster/Options.")
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }

  public OptionsGetResponseSuccessData cmeAppName(String cmeAppName) {
    this.cmeAppName = cmeAppName;
    return this;
  }

   /**
   * Name of the CME App (CloudCluster by default).
   * @return cmeAppName
  **/
  @ApiModelProperty(value = "Name of the CME App (CloudCluster by default).")
  public String getCmeAppName() {
    return cmeAppName;
  }

  public void setCmeAppName(String cmeAppName) {
    this.cmeAppName = cmeAppName;
  }

  public OptionsGetResponseSuccessData cmeAppDBID(String cmeAppDBID) {
    this.cmeAppDBID = cmeAppDBID;
    return this;
  }

   /**
   * DBID of the CME App.
   * @return cmeAppDBID
  **/
  @ApiModelProperty(value = "DBID of the CME App.")
  public String getCmeAppDBID() {
    return cmeAppDBID;
  }

  public void setCmeAppDBID(String cmeAppDBID) {
    this.cmeAppDBID = cmeAppDBID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsGetResponseSuccessData optionsGetResponseSuccessData = (OptionsGetResponseSuccessData) o;
    return Objects.equals(this.options, optionsGetResponseSuccessData.options) &&
        Objects.equals(this.cmeAppName, optionsGetResponseSuccessData.cmeAppName) &&
        Objects.equals(this.cmeAppDBID, optionsGetResponseSuccessData.cmeAppDBID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, cmeAppName, cmeAppDBID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsGetResponseSuccessData {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    cmeAppName: ").append(toIndentedString(cmeAppName)).append("\n");
    sb.append("    cmeAppDBID: ").append(toIndentedString(cmeAppDBID)).append("\n");
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

