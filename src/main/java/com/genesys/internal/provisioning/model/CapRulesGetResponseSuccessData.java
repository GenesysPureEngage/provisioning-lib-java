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
 * CapRulesGetResponseSuccessData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-28T11:17:30.325Z")
public class CapRulesGetResponseSuccessData {
  @SerializedName("capacityRules")
  private Object capacityRules = null;

  public CapRulesGetResponseSuccessData capacityRules(Object capacityRules) {
    this.capacityRules = capacityRules;
    return this;
  }

   /**
   * List of capacity rules
   * @return capacityRules
  **/
  @ApiModelProperty(value = "List of capacity rules")
  public Object getCapacityRules() {
    return capacityRules;
  }

  public void setCapacityRules(Object capacityRules) {
    this.capacityRules = capacityRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapRulesGetResponseSuccessData capRulesGetResponseSuccessData = (CapRulesGetResponseSuccessData) o;
    return Objects.equals(this.capacityRules, capRulesGetResponseSuccessData.capacityRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapRulesGetResponseSuccessData {\n");
    
    sb.append("    capacityRules: ").append(toIndentedString(capacityRules)).append("\n");
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

