package com.example.springjpaintro.controller;

import com.example.springjpaintro.dto.LoginRequest;
import com.example.springjpaintro.dto.LoginResponse;
import com.example.springjpaintro.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  @Autowired
  private LoginService loginService;

  @PostMapping("login")
  public LoginResponse login(@RequestBody LoginRequest loginRequest) {

    LoginResponse response = loginService.getLoginResponse(loginRequest);

    return response;
  }

  @PostMapping("logout")
  public void logout(@RequestHeader("token") String token) {
    loginService.logout(token);
  }

}
