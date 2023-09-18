package com.example.springjpaintro.exception;

public class UserForbiddenException extends RuntimeException {

  public UserForbiddenException() {
    super("You are Forbidden");
  }
}
