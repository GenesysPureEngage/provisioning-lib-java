/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model.  The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.722
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.provisioning.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Properties related to WWE. 
 */
@ApiModel(description = "Properties related to WWE. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-19T05:22:58.150Z")
public class UpdateUserDataWwe {
  @SerializedName("roles")
  private List<String> roles = new ArrayList<String>();

  @SerializedName("deletedRoles")
  private List<String> deletedRoles = new ArrayList<String>();

  public UpdateUserDataWwe roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UpdateUserDataWwe addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The roles that will be added to the user. 
   * @return roles
  **/
  @ApiModelProperty(example = "null", value = "The roles that will be added to the user. ")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public UpdateUserDataWwe deletedRoles(List<String> deletedRoles) {
    this.deletedRoles = deletedRoles;
    return this;
  }

  public UpdateUserDataWwe addDeletedRolesItem(String deletedRolesItem) {
    this.deletedRoles.add(deletedRolesItem);
    return this;
  }

   /**
   * The roles that will be removed from the user. 
   * @return deletedRoles
  **/
  @ApiModelProperty(example = "null", value = "The roles that will be removed from the user. ")
  public List<String> getDeletedRoles() {
    return deletedRoles;
  }

  public void setDeletedRoles(List<String> deletedRoles) {
    this.deletedRoles = deletedRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserDataWwe updateUserDataWwe = (UpdateUserDataWwe) o;
    return Objects.equals(this.roles, updateUserDataWwe.roles) &&
        Objects.equals(this.deletedRoles, updateUserDataWwe.deletedRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, deletedRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserDataWwe {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    deletedRoles: ").append(toIndentedString(deletedRoles)).append("\n");
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

