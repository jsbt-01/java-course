package com.example.springjpaintro.service;

import com.example.springjpaintro.dto.LoginRequest;
import com.example.springjpaintro.dto.LoginResponse;
import com.example.springjpaintro.entity.TokenEntity;
import com.example.springjpaintro.entity.UserEntity;
import com.example.springjpaintro.exception.IncorrectCredentialsException;
import com.example.springjpaintro.repository.TokenRepository;
import com.example.springjpaintro.repository.UserRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private TokenRepository tokenRepository;

  public LoginResponse getLoginResponse(LoginRequest loginRequest) {
    UserEntity userEntity = userRepository.findByUsernameAndPassword(loginRequest.getUsername(),
        loginRequest.getPassword());

    if (userEntity != null) {
      String token = RandomStringUtils.randomAlphabetic(5);

      TokenEntity tokenEntity = new TokenEntity();
      tokenEntity.setToken(token);
      tokenRepository.save(tokenEntity);

      return new LoginResponse(token);
    } else {
      throw new IncorrectCredentialsException();
    }
  }

  public void logout(String token) {
    tokenRepository.deleteByToken(token);
  }
}
