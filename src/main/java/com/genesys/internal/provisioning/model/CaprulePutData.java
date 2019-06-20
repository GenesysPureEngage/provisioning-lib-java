/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.53.3367
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
import java.util.ArrayList;
import java.util.List;

/**
 * CaprulePutData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:35:07.596Z")
public class CaprulePutData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("mediaRules")
  private Object mediaRules = null;

  @SerializedName("deletedMediaRules")
  private List<String> deletedMediaRules = null;

  public CaprulePutData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * CfgScript name 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "CfgScript name ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CaprulePutData mediaRules(Object mediaRules) {
    this.mediaRules = mediaRules;
    return this;
  }

   /**
   * Key/values pairs where keys are media types and vaules are objects representing logical expressions for their capacities 
   * @return mediaRules
  **/
  @ApiModelProperty(value = "Key/values pairs where keys are media types and vaules are objects representing logical expressions for their capacities ")
  public Object getMediaRules() {
    return mediaRules;
  }

  public void setMediaRules(Object mediaRules) {
    this.mediaRules = mediaRules;
  }

  public CaprulePutData deletedMediaRules(List<String> deletedMediaRules) {
    this.deletedMediaRules = deletedMediaRules;
    return this;
  }

  public CaprulePutData addDeletedMediaRulesItem(String deletedMediaRulesItem) {
    if (this.deletedMediaRules == null) {
      this.deletedMediaRules = new ArrayList<String>();
    }
    this.deletedMediaRules.add(deletedMediaRulesItem);
    return this;
  }

   /**
   * A list of media types that should be deleted 
   * @return deletedMediaRules
  **/
  @ApiModelProperty(value = "A list of media types that should be deleted ")
  public List<String> getDeletedMediaRules() {
    return deletedMediaRules;
  }

  public void setDeletedMediaRules(List<String> deletedMediaRules) {
    this.deletedMediaRules = deletedMediaRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaprulePutData caprulePutData = (CaprulePutData) o;
    return Objects.equals(this.name, caprulePutData.name) &&
        Objects.equals(this.mediaRules, caprulePutData.mediaRules) &&
        Objects.equals(this.deletedMediaRules, caprulePutData.deletedMediaRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mediaRules, deletedMediaRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaprulePutData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mediaRules: ").append(toIndentedString(mediaRules)).append("\n");
    sb.append("    deletedMediaRules: ").append(toIndentedString(deletedMediaRules)).append("\n");
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

