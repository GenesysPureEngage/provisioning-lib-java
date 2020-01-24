/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.75.4131
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
 * CheckMigrateConflictsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-13T18:04:39.943Z")
public class CheckMigrateConflictsData {
  @SerializedName("migrations")
  private Object migrations = null;

  public CheckMigrateConflictsData migrations(Object migrations) {
    this.migrations = migrations;
    return this;
  }

   /**
   * Returns migration conflicts.
   * @return migrations
  **/
  @ApiModelProperty(value = "Returns migration conflicts.")
  public Object getMigrations() {
    return migrations;
  }

  public void setMigrations(Object migrations) {
    this.migrations = migrations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckMigrateConflictsData checkMigrateConflictsData = (CheckMigrateConflictsData) o;
    return Objects.equals(this.migrations, checkMigrateConflictsData.migrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckMigrateConflictsData {\n");
    
    sb.append("    migrations: ").append(toIndentedString(migrations)).append("\n");
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

