package com.salatin.mongoproject2;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

public class CustomAuthorizationFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    if (request.getServletPath().equals("/login")) {
      filterChain.doFilter(request, response);
    } else {
      try {
        String authorizationHeader = request.getHeader("Authorization");
        System.out.println(authorizationHeader);
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoiNjI5YTk5MGYxMzFkMzA3MjI0MGYxNzQ5IiwiZXhwIjoxNjU2MDI4NjQ3fQ.1KD_v4TTR9pnXl0bZUv0Lkp8BwY3IH4E2abxcXkm-9o";
        Algorithm algorithm = Algorithm.HMAC256("rahasia");
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT decodedJWT = verifier.verify(token);
        System.out.println(decodedJWT);
      } catch (Exception e) {
        System.out.println("=============");
        System.out.println(e.getMessage());      }
        System.out.println("=============");
      
    }
  }
  
}
