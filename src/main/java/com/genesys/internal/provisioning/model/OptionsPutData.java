/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.78.4173
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
 * OptionsPutData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T21:20:25.893Z")
public class OptionsPutData {
  @SerializedName("newOptions")
  private Object newOptions = null;

  @SerializedName("changedOptions")
  private Object changedOptions = null;

  @SerializedName("deletedOptions")
  private Object deletedOptions = null;

  public OptionsPutData newOptions(Object newOptions) {
    this.newOptions = newOptions;
    return this;
  }

   /**
   * New CloudCluster app Options.  Effect: Adds sections, keys and values in CloudCluster/Options 
   * @return newOptions
  **/
  @ApiModelProperty(value = "New CloudCluster app Options.  Effect: Adds sections, keys and values in CloudCluster/Options ")
  public Object getNewOptions() {
    return newOptions;
  }

  public void setNewOptions(Object newOptions) {
    this.newOptions = newOptions;
  }

  public OptionsPutData changedOptions(Object changedOptions) {
    this.changedOptions = changedOptions;
    return this;
  }

   /**
   * Changed CloudCluster app Options.  Effect: Updates existing values in CloudCluster/Options 
   * @return changedOptions
  **/
  @ApiModelProperty(value = "Changed CloudCluster app Options.  Effect: Updates existing values in CloudCluster/Options ")
  public Object getChangedOptions() {
    return changedOptions;
  }

  public void setChangedOptions(Object changedOptions) {
    this.changedOptions = changedOptions;
  }

  public OptionsPutData deletedOptions(Object deletedOptions) {
    this.deletedOptions = deletedOptions;
    return this;
  }

   /**
   * Deleted CloudCluster app Options.  Effect: Deletes sections, keys and values in CloudCluster/Options 
   * @return deletedOptions
  **/
  @ApiModelProperty(value = "Deleted CloudCluster app Options.  Effect: Deletes sections, keys and values in CloudCluster/Options ")
  public Object getDeletedOptions() {
    return deletedOptions;
  }

  public void setDeletedOptions(Object deletedOptions) {
    this.deletedOptions = deletedOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsPutData optionsPutData = (OptionsPutData) o;
    return Objects.equals(this.newOptions, optionsPutData.newOptions) &&
        Objects.equals(this.changedOptions, optionsPutData.changedOptions) &&
        Objects.equals(this.deletedOptions, optionsPutData.deletedOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOptions, changedOptions, deletedOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsPutData {\n");
    
    sb.append("    newOptions: ").append(toIndentedString(newOptions)).append("\n");
    sb.append("    changedOptions: ").append(toIndentedString(changedOptions)).append("\n");
    sb.append("    deletedOptions: ").append(toIndentedString(deletedOptions)).append("\n");
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

