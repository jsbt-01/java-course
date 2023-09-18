package com.example.springjpaintro.filter;

import com.example.springjpaintro.exception.UserForbiddenException;
import com.example.springjpaintro.repository.TokenRepository;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

@Service
public class UserVerificationFilter extends OncePerRequestFilter {

  @Autowired
  private TokenRepository tokenRepository;

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {

    String url = request.getRequestURI();

    if (url.startsWith("/clinic") || url.startsWith("/doctor")) {
      String token = request.getHeader("token");

      if (!tokenRepository.existsByToken(token)) {
        throw new UserForbiddenException();
      }
    }

    filterChain.doFilter(request, response);
  }
}
