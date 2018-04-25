/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.15.2202
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
 * A map containing parameters to filter and sort users. Only users that match the filter are exported. 
 */
@ApiModel(description = "A map containing parameters to filter and sort users. Only users that match the filter are exported. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-25T17:21:17.629Z")
public class ExportFileDataFilterParameters {
  @SerializedName("agentGroupFilter")
  private List<String> agentGroupFilter = null;

  @SerializedName("order")
  private String order = null;

  @SerializedName("sortBy")
  private List<String> sortBy = null;

  @SerializedName("subresources")
  private String subresources = "skills,devices";

  public ExportFileDataFilterParameters agentGroupFilter(List<String> agentGroupFilter) {
    this.agentGroupFilter = agentGroupFilter;
    return this;
  }

  public ExportFileDataFilterParameters addAgentGroupFilterItem(String agentGroupFilterItem) {
    if (this.agentGroupFilter == null) {
      this.agentGroupFilter = new ArrayList<String>();
    }
    this.agentGroupFilter.add(agentGroupFilterItem);
    return this;
  }

   /**
   * An array of agent group names in which the user is included.
   * @return agentGroupFilter
  **/
  @ApiModelProperty(value = "An array of agent group names in which the user is included.")
  public List<String> getAgentGroupFilter() {
    return agentGroupFilter;
  }

  public void setAgentGroupFilter(List<String> agentGroupFilter) {
    this.agentGroupFilter = agentGroupFilter;
  }

  public ExportFileDataFilterParameters order(String order) {
    this.order = order;
    return this;
  }

   /**
   * The sort order, either Ascending or Descending.
   * @return order
  **/
  @ApiModelProperty(value = "The sort order, either Ascending or Descending.")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ExportFileDataFilterParameters sortBy(List<String> sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public ExportFileDataFilterParameters addSortByItem(String sortByItem) {
    if (this.sortBy == null) {
      this.sortBy = new ArrayList<String>();
    }
    this.sortBy.add(sortByItem);
    return this;
  }

   /**
   * A comma-separated list of fields used to sort the exported users.
   * @return sortBy
  **/
  @ApiModelProperty(value = "A comma-separated list of fields used to sort the exported users.")
  public List<String> getSortBy() {
    return sortBy;
  }

  public void setSortBy(List<String> sortBy) {
    this.sortBy = sortBy;
  }

  public ExportFileDataFilterParameters subresources(String subresources) {
    this.subresources = subresources;
    return this;
  }

   /**
   * A comma-separated list of subresources (for example, skills) to include in the export.
   * @return subresources
  **/
  @ApiModelProperty(value = "A comma-separated list of subresources (for example, skills) to include in the export.")
  public String getSubresources() {
    return subresources;
  }

  public void setSubresources(String subresources) {
    this.subresources = subresources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportFileDataFilterParameters exportFileDataFilterParameters = (ExportFileDataFilterParameters) o;
    return Objects.equals(this.agentGroupFilter, exportFileDataFilterParameters.agentGroupFilter) &&
        Objects.equals(this.order, exportFileDataFilterParameters.order) &&
        Objects.equals(this.sortBy, exportFileDataFilterParameters.sortBy) &&
        Objects.equals(this.subresources, exportFileDataFilterParameters.subresources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentGroupFilter, order, sortBy, subresources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportFileDataFilterParameters {\n");
    
    sb.append("    agentGroupFilter: ").append(toIndentedString(agentGroupFilter)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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

