/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.40.3017
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
import java.util.ArrayList;
import java.util.List;

/**
 * GetUsersSuccessResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-29T01:58:55.244Z")
public class GetUsersSuccessResponseData {
  @SerializedName("users")
  private List<Object> users = null;

  @SerializedName("user")
  private Object user = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  public GetUsersSuccessResponseData users(List<Object> users) {
    this.users = users;
    return this;
  }

  public GetUsersSuccessResponseData addUsersItem(Object usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<Object>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of user objects fetched if dbid parameter is absent.
   * @return users
  **/
  @ApiModelProperty(value = "List of user objects fetched if dbid parameter is absent.")
  public List<Object> getUsers() {
    return users;
  }

  public void setUsers(List<Object> users) {
    this.users = users;
  }

  public GetUsersSuccessResponseData user(Object user) {
    this.user = user;
    return this;
  }

   /**
   * User object fetched if dbid parameter is a person DBID or &#39;me&#39;.
   * @return user
  **/
  @ApiModelProperty(value = "User object fetched if dbid parameter is a person DBID or 'me'.")
  public Object getUser() {
    return user;
  }

  public void setUser(Object user) {
    this.user = user;
  }

  public GetUsersSuccessResponseData totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of users. Available if dbid parameter is absent.
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total number of users. Available if dbid parameter is absent.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersSuccessResponseData getUsersSuccessResponseData = (GetUsersSuccessResponseData) o;
    return Objects.equals(this.users, getUsersSuccessResponseData.users) &&
        Objects.equals(this.user, getUsersSuccessResponseData.user) &&
        Objects.equals(this.totalCount, getUsersSuccessResponseData.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, user, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersSuccessResponseData {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

