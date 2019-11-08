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
 * ObjectPermissions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-07T11:07:15.242Z")
public class ObjectPermissions {
  @SerializedName("DBID")
  private Integer DBID = null;

  @SerializedName("data")
  private Object data = null;

  public ObjectPermissions DBID(Integer DBID) {
    this.DBID = DBID;
    return this;
  }

   /**
   * DBID of an object. 
   * @return DBID
  **/
  @ApiModelProperty(required = true, value = "DBID of an object. ")
  public Integer getDBID() {
    return DBID;
  }

  public void setDBID(Integer DBID) {
    this.DBID = DBID;
  }

  public ObjectPermissions data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * List of the object&#39;s ACEs. 
   * @return data
  **/
  @ApiModelProperty(required = true, value = "List of the object's ACEs. ")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectPermissions objectPermissions = (ObjectPermissions) o;
    return Objects.equals(this.DBID, objectPermissions.DBID) &&
        Objects.equals(this.data, objectPermissions.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DBID, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectPermissions {\n");
    
    sb.append("    DBID: ").append(toIndentedString(DBID)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

