package com.example.springjpaintro.dto.entry.external;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalEntry {

  @JsonProperty("API")
  private String api;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Auth")
  private String auth;

  @JsonProperty("HTTPS")
  private boolean https;

  @JsonProperty("Cors")
  private String cors;

  @JsonProperty("Link")
  private String link;

  @JsonProperty("Category")
  private String category;

  public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAuth() {
    return auth;
  }

  public void setAuth(String auth) {
    this.auth = auth;
  }

  public boolean isHttps() {
    return https;
  }

  public void setHttps(boolean https) {
    this.https = https;
  }

  public String getCors() {
    return cors;
  }

  public void setCors(String cors) {
    this.cors = cors;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}