/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.877
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import com.genesys.internal.provisioning.model.ExportFileDataFilterParameters;
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
 * ExportFileData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-10T15:04:14.497Z")
public class ExportFileData {
  @SerializedName("fields")
  private List<String> fields = new ArrayList<String>();

  @SerializedName("fileName")
  private String fileName = "users.csv";

  @SerializedName("personDBIDs")
  private List<String> personDBIDs = new ArrayList<String>();

  @SerializedName("filterParameters")
  private ExportFileDataFilterParameters filterParameters = null;

  public ExportFileData fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ExportFileData addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Array of user property names to include  Effect: Only these names will be included in exported user structure 
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "Array of user property names to include  Effect: Only these names will be included in exported user structure ")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public ExportFileData fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File Name to save exported users.  Effect: Controls the file name to save. 
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "File Name to save exported users.  Effect: Controls the file name to save. ")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ExportFileData personDBIDs(List<String> personDBIDs) {
    this.personDBIDs = personDBIDs;
    return this;
  }

  public ExportFileData addPersonDBIDsItem(String personDBIDsItem) {
    this.personDBIDs.add(personDBIDsItem);
    return this;
  }

   /**
   * List of User IDs to export  Effect: Controls which users will be exported. 
   * @return personDBIDs
  **/
  @ApiModelProperty(required = true, value = "List of User IDs to export  Effect: Controls which users will be exported. ")
  public List<String> getPersonDBIDs() {
    return personDBIDs;
  }

  public void setPersonDBIDs(List<String> personDBIDs) {
    this.personDBIDs = personDBIDs;
  }

  public ExportFileData filterParameters(ExportFileDataFilterParameters filterParameters) {
    this.filterParameters = filterParameters;
    return this;
  }

   /**
   * Get filterParameters
   * @return filterParameters
  **/
  @ApiModelProperty(value = "")
  public ExportFileDataFilterParameters getFilterParameters() {
    return filterParameters;
  }

  public void setFilterParameters(ExportFileDataFilterParameters filterParameters) {
    this.filterParameters = filterParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportFileData exportFileData = (ExportFileData) o;
    return Objects.equals(this.fields, exportFileData.fields) &&
        Objects.equals(this.fileName, exportFileData.fileName) &&
        Objects.equals(this.personDBIDs, exportFileData.personDBIDs) &&
        Objects.equals(this.filterParameters, exportFileData.filterParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, fileName, personDBIDs, filterParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportFileData {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    personDBIDs: ").append(toIndentedString(personDBIDs)).append("\n");
    sb.append("    filterParameters: ").append(toIndentedString(filterParameters)).append("\n");
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

