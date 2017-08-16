/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.813
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.provisioning.model;

import java.util.Objects;
import com.genesys.provisioning.model.GetImportStatusResponseData;
import com.genesys.provisioning.model.GetImportStatusResponseStatus;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GetImportStatusResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-16T15:04:06.653Z")
public class GetImportStatusResponse {
  @SerializedName("status")
  private GetImportStatusResponseStatus status = null;

  @SerializedName("data")
  private GetImportStatusResponseData data = null;

  public GetImportStatusResponse status(GetImportStatusResponseStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetImportStatusResponseStatus getStatus() {
    return status;
  }

  public void setStatus(GetImportStatusResponseStatus status) {
    this.status = status;
  }

  public GetImportStatusResponse data(GetImportStatusResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetImportStatusResponseData getData() {
    return data;
  }

  public void setData(GetImportStatusResponseData data) {
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
    GetImportStatusResponse getImportStatusResponse = (GetImportStatusResponse) o;
    return Objects.equals(this.status, getImportStatusResponse.status) &&
        Objects.equals(this.data, getImportStatusResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImportStatusResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

