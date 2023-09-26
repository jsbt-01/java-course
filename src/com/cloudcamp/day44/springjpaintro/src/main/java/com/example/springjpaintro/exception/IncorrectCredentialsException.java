package com.example.springjpaintro.exception;

public class IncorrectCredentialsException extends RuntimeException {

  public IncorrectCredentialsException() {
    super("Incorrect username/password");
  }
}
