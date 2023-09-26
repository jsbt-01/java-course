package com.example.springjpaintro.advice;

import com.example.springjpaintro.exception.IncorrectCredentialsException;
import com.example.springjpaintro.exception.UserForbiddenException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandlerForApi {

  @ExceptionHandler(IncorrectCredentialsException.class)
  @ResponseBody
  public ResponseEntity<String> handleException(IncorrectCredentialsException ex) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
  }

  @ExceptionHandler(UserForbiddenException.class)
  @ResponseBody
  public ResponseEntity<String> handleException(UserForbiddenException ex) {
    return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
  }
}
