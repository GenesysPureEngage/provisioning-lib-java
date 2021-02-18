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
 * UpdateResetTimesData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-17T16:42:52.897Z")
public class UpdateResetTimesData {
  @SerializedName("resetTime")
  private String resetTime = null;

  @SerializedName("location")
  private String location = null;

  public UpdateResetTimesData resetTime(String resetTime) {
    this.resetTime = resetTime;
    return this;
  }

   /**
   * Set to dynamicTimeProfile of matching stat
   * @return resetTime
  **/
  @ApiModelProperty(required = true, value = "Set to dynamicTimeProfile of matching stat")
  public String getResetTime() {
    return resetTime;
  }

  public void setResetTime(String resetTime) {
    this.resetTime = resetTime;
  }

  public UpdateResetTimesData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The normalized location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "The normalized location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResetTimesData updateResetTimesData = (UpdateResetTimesData) o;
    return Objects.equals(this.resetTime, updateResetTimesData.resetTime) &&
        Objects.equals(this.location, updateResetTimesData.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetTime, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResetTimesData {\n");
    
    sb.append("    resetTime: ").append(toIndentedString(resetTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

