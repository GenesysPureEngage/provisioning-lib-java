/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.05.1207
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

/**
 * Extension
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-07T20:30:56.705Z")
public class Extension {
  @SerializedName("number")
  private String number = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("placeName")
  private String placeName = null;

  public Extension number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Phone number
   * @return number
  **/
  @ApiModelProperty(value = "Phone number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Extension description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Desrciption (Mobile, Office)
   * @return description
  **/
  @ApiModelProperty(value = "Desrciption (Mobile, Office)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Extension isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * true/false
   * @return isDefault
  **/
  @ApiModelProperty(value = "true/false")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public Extension placeName(String placeName) {
    this.placeName = placeName;
    return this;
  }

   /**
   * Name of the corresponding place name
   * @return placeName
  **/
  @ApiModelProperty(value = "Name of the corresponding place name")
  public String getPlaceName() {
    return placeName;
  }

  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extension extension = (Extension) o;
    return Objects.equals(this.number, extension.number) &&
        Objects.equals(this.description, extension.description) &&
        Objects.equals(this.isDefault, extension.isDefault) &&
        Objects.equals(this.placeName, extension.placeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, description, isDefault, placeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extension {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
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

