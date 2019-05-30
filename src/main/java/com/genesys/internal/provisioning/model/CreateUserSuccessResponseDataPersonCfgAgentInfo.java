/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.50.3296
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
 * CreateUserSuccessResponseDataPersonCfgAgentInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-29T16:59:00.802Z")
public class CreateUserSuccessResponseDataPersonCfgAgentInfo {
  @SerializedName("placeDBID")
  private String placeDBID = null;

  @SerializedName("siteDBID")
  private String siteDBID = null;

  @SerializedName("contractDBID")
  private String contractDBID = null;

  @SerializedName("capacityRuleDBID")
  private String capacityRuleDBID = null;

  public CreateUserSuccessResponseDataPersonCfgAgentInfo placeDBID(String placeDBID) {
    this.placeDBID = placeDBID;
    return this;
  }

   /**
   * Get placeDBID
   * @return placeDBID
  **/
  @ApiModelProperty(value = "")
  public String getPlaceDBID() {
    return placeDBID;
  }

  public void setPlaceDBID(String placeDBID) {
    this.placeDBID = placeDBID;
  }

  public CreateUserSuccessResponseDataPersonCfgAgentInfo siteDBID(String siteDBID) {
    this.siteDBID = siteDBID;
    return this;
  }

   /**
   * Get siteDBID
   * @return siteDBID
  **/
  @ApiModelProperty(value = "")
  public String getSiteDBID() {
    return siteDBID;
  }

  public void setSiteDBID(String siteDBID) {
    this.siteDBID = siteDBID;
  }

  public CreateUserSuccessResponseDataPersonCfgAgentInfo contractDBID(String contractDBID) {
    this.contractDBID = contractDBID;
    return this;
  }

   /**
   * Get contractDBID
   * @return contractDBID
  **/
  @ApiModelProperty(value = "")
  public String getContractDBID() {
    return contractDBID;
  }

  public void setContractDBID(String contractDBID) {
    this.contractDBID = contractDBID;
  }

  public CreateUserSuccessResponseDataPersonCfgAgentInfo capacityRuleDBID(String capacityRuleDBID) {
    this.capacityRuleDBID = capacityRuleDBID;
    return this;
  }

   /**
   * Get capacityRuleDBID
   * @return capacityRuleDBID
  **/
  @ApiModelProperty(value = "")
  public String getCapacityRuleDBID() {
    return capacityRuleDBID;
  }

  public void setCapacityRuleDBID(String capacityRuleDBID) {
    this.capacityRuleDBID = capacityRuleDBID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserSuccessResponseDataPersonCfgAgentInfo createUserSuccessResponseDataPersonCfgAgentInfo = (CreateUserSuccessResponseDataPersonCfgAgentInfo) o;
    return Objects.equals(this.placeDBID, createUserSuccessResponseDataPersonCfgAgentInfo.placeDBID) &&
        Objects.equals(this.siteDBID, createUserSuccessResponseDataPersonCfgAgentInfo.siteDBID) &&
        Objects.equals(this.contractDBID, createUserSuccessResponseDataPersonCfgAgentInfo.contractDBID) &&
        Objects.equals(this.capacityRuleDBID, createUserSuccessResponseDataPersonCfgAgentInfo.capacityRuleDBID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeDBID, siteDBID, contractDBID, capacityRuleDBID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserSuccessResponseDataPersonCfgAgentInfo {\n");
    
    sb.append("    placeDBID: ").append(toIndentedString(placeDBID)).append("\n");
    sb.append("    siteDBID: ").append(toIndentedString(siteDBID)).append("\n");
    sb.append("    contractDBID: ").append(toIndentedString(contractDBID)).append("\n");
    sb.append("    capacityRuleDBID: ").append(toIndentedString(capacityRuleDBID)).append("\n");
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

