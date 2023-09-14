package com.example.springjpaintro.dto.entry.internal;

public class Entry {

  private String api;

  private String description;

  private String auth;

  private boolean secure;

  private String cors;

  private String url;

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

  public boolean isSecure() {
    return secure;
  }

  public void setSecure(boolean secure) {
    this.secure = secure;
  }

  public String getCors() {
    return cors;
  }

  public void setCors(String cors) {
    this.cors = cors;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}