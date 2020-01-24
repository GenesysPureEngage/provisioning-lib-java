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
 * GetMOHSettingsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-13T18:04:39.943Z")
public class GetMOHSettingsData {
  @SerializedName("musicEnabled")
  private Boolean musicEnabled = null;

  @SerializedName("musicFile")
  private String musicFile = null;

  public GetMOHSettingsData musicEnabled(Boolean musicEnabled) {
    this.musicEnabled = musicEnabled;
    return this;
  }

   /**
   * Define is music enabled/disabled.
   * @return musicEnabled
  **/
  @ApiModelProperty(value = "Define is music enabled/disabled.")
  public Boolean isMusicEnabled() {
    return musicEnabled;
  }

  public void setMusicEnabled(Boolean musicEnabled) {
    this.musicEnabled = musicEnabled;
  }

  public GetMOHSettingsData musicFile(String musicFile) {
    this.musicFile = musicFile;
    return this;
  }

   /**
   * Define a music file that uses now.
   * @return musicFile
  **/
  @ApiModelProperty(value = "Define a music file that uses now.")
  public String getMusicFile() {
    return musicFile;
  }

  public void setMusicFile(String musicFile) {
    this.musicFile = musicFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMOHSettingsData getMOHSettingsData = (GetMOHSettingsData) o;
    return Objects.equals(this.musicEnabled, getMOHSettingsData.musicEnabled) &&
        Objects.equals(this.musicFile, getMOHSettingsData.musicFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(musicEnabled, musicFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMOHSettingsData {\n");
    
    sb.append("    musicEnabled: ").append(toIndentedString(musicEnabled)).append("\n");
    sb.append("    musicFile: ").append(toIndentedString(musicFile)).append("\n");
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

