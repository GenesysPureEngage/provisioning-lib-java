/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.08.1664
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetImportStatusResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-22T17:04:58.377Z")
public class GetImportStatusResponseData {
  @SerializedName("activeImporters")
  private List<String> activeImporters = null;

  @SerializedName("adminName")
  private String adminName = null;

  @SerializedName("failed")
  private List<String> failed = null;

  @SerializedName("lastEntity")
  private String lastEntity = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("sheetName")
  private String sheetName = null;

  @SerializedName("stopRequested")
  private Boolean stopRequested = null;

  @SerializedName("stopped")
  private Boolean stopped = null;

  @SerializedName("succeedCount")
  private BigDecimal succeedCount = null;

  @SerializedName("totalCount")
  private BigDecimal totalCount = null;

  public GetImportStatusResponseData activeImporters(List<String> activeImporters) {
    this.activeImporters = activeImporters;
    return this;
  }

  public GetImportStatusResponseData addActiveImportersItem(String activeImportersItem) {
    if (this.activeImporters == null) {
      this.activeImporters = new ArrayList<String>();
    }
    this.activeImporters.add(activeImportersItem);
    return this;
  }

   /**
   * The IDs (usernames) of all administrators currently running a bulk import.
   * @return activeImporters
  **/
  @ApiModelProperty(value = "The IDs (usernames) of all administrators currently running a bulk import.")
  public List<String> getActiveImporters() {
    return activeImporters;
  }

  public void setActiveImporters(List<String> activeImporters) {
    this.activeImporters = activeImporters;
  }

  public GetImportStatusResponseData adminName(String adminName) {
    this.adminName = adminName;
    return this;
  }

   /**
   * The login name of an administrator for the tenant.
   * @return adminName
  **/
  @ApiModelProperty(value = "The login name of an administrator for the tenant.")
  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public GetImportStatusResponseData failed(List<String> failed) {
    this.failed = failed;
    return this;
  }

  public GetImportStatusResponseData addFailedItem(String failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<String>();
    }
    this.failed.add(failedItem);
    return this;
  }

   /**
   * An array of errors that occurred during the import.
   * @return failed
  **/
  @ApiModelProperty(value = "An array of errors that occurred during the import.")
  public List<String> getFailed() {
    return failed;
  }

  public void setFailed(List<String> failed) {
    this.failed = failed;
  }

  public GetImportStatusResponseData lastEntity(String lastEntity) {
    this.lastEntity = lastEntity;
    return this;
  }

   /**
   * The name of the last object processed.
   * @return lastEntity
  **/
  @ApiModelProperty(value = "The name of the last object processed.")
  public String getLastEntity() {
    return lastEntity;
  }

  public void setLastEntity(String lastEntity) {
    this.lastEntity = lastEntity;
  }

  public GetImportStatusResponseData operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * The name of the current operation.
   * @return operation
  **/
  @ApiModelProperty(value = "The name of the current operation.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public GetImportStatusResponseData sheetName(String sheetName) {
    this.sheetName = sheetName;
    return this;
  }

   /**
   * The name of the sheet currently being processed in the CSV/XLS file.
   * @return sheetName
  **/
  @ApiModelProperty(value = "The name of the sheet currently being processed in the CSV/XLS file.")
  public String getSheetName() {
    return sheetName;
  }

  public void setSheetName(String sheetName) {
    this.sheetName = sheetName;
  }

  public GetImportStatusResponseData stopRequested(Boolean stopRequested) {
    this.stopRequested = stopRequested;
    return this;
  }

   /**
   * This value is set to &#x60;true&#x60; if the user pressed **Stop Import**.
   * @return stopRequested
  **/
  @ApiModelProperty(value = "This value is set to `true` if the user pressed **Stop Import**.")
  public Boolean isStopRequested() {
    return stopRequested;
  }

  public void setStopRequested(Boolean stopRequested) {
    this.stopRequested = stopRequested;
  }

  public GetImportStatusResponseData stopped(Boolean stopped) {
    this.stopped = stopped;
    return this;
  }

   /**
   * This value is set to &#x60;true&#x60; if the import is stopped.
   * @return stopped
  **/
  @ApiModelProperty(value = "This value is set to `true` if the import is stopped.")
  public Boolean isStopped() {
    return stopped;
  }

  public void setStopped(Boolean stopped) {
    this.stopped = stopped;
  }

  public GetImportStatusResponseData succeedCount(BigDecimal succeedCount) {
    this.succeedCount = succeedCount;
    return this;
  }

   /**
   * The number of successfully processed records.
   * @return succeedCount
  **/
  @ApiModelProperty(value = "The number of successfully processed records.")
  public BigDecimal getSucceedCount() {
    return succeedCount;
  }

  public void setSucceedCount(BigDecimal succeedCount) {
    this.succeedCount = succeedCount;
  }

  public GetImportStatusResponseData totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of processed records.
   * @return totalCount
  **/
  @ApiModelProperty(value = "The total number of processed records.")
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
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
    GetImportStatusResponseData getImportStatusResponseData = (GetImportStatusResponseData) o;
    return Objects.equals(this.activeImporters, getImportStatusResponseData.activeImporters) &&
        Objects.equals(this.adminName, getImportStatusResponseData.adminName) &&
        Objects.equals(this.failed, getImportStatusResponseData.failed) &&
        Objects.equals(this.lastEntity, getImportStatusResponseData.lastEntity) &&
        Objects.equals(this.operation, getImportStatusResponseData.operation) &&
        Objects.equals(this.sheetName, getImportStatusResponseData.sheetName) &&
        Objects.equals(this.stopRequested, getImportStatusResponseData.stopRequested) &&
        Objects.equals(this.stopped, getImportStatusResponseData.stopped) &&
        Objects.equals(this.succeedCount, getImportStatusResponseData.succeedCount) &&
        Objects.equals(this.totalCount, getImportStatusResponseData.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeImporters, adminName, failed, lastEntity, operation, sheetName, stopRequested, stopped, succeedCount, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImportStatusResponseData {\n");
    
    sb.append("    activeImporters: ").append(toIndentedString(activeImporters)).append("\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    lastEntity: ").append(toIndentedString(lastEntity)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    sheetName: ").append(toIndentedString(sheetName)).append("\n");
    sb.append("    stopRequested: ").append(toIndentedString(stopRequested)).append("\n");
    sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
    sb.append("    succeedCount: ").append(toIndentedString(succeedCount)).append("\n");
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

