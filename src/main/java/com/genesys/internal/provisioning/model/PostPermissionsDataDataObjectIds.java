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
 * PostPermissionsDataDataObjectIds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-07T11:07:15.242Z")
public class PostPermissionsDataDataObjectIds {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public PostPermissionsDataDataObjectIds id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Object ID (DBID) 
   * @return id
  **/
  @ApiModelProperty(value = "Object ID (DBID) ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostPermissionsDataDataObjectIds name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Or object name if ID is unknown 
   * @return name
  **/
  @ApiModelProperty(value = "Or object name if ID is unknown ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPermissionsDataDataObjectIds postPermissionsDataDataObjectIds = (PostPermissionsDataDataObjectIds) o;
    return Objects.equals(this.id, postPermissionsDataDataObjectIds.id) &&
        Objects.equals(this.name, postPermissionsDataDataObjectIds.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPermissionsDataDataObjectIds {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

