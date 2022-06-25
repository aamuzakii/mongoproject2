package com.salatin.mongoproject2;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;

public class CustomAuthenticationFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {

    try {
      HttpTransport transport = new NetHttpTransport();
      JsonFactory jsonFactory = new GsonFactory();
      // Dude! credits for this boy: https://stackoverflow.com/a/66457568/14113448
      String fullToken = "1093196801427-f8f7lms0aqo2m8tq030bdp6815pf34fi.apps.googleusercontent.com";

      GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
      .setAudience(Collections.singletonList(fullToken))
      .build();
      String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjJiMDllNzQ0ZDU4Yzk5NTVkNGYyNDBiNmE5MmY3YjM3ZmVhZDJmZjgiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXpwIjoiMTA5MzE5NjgwMTQyNy1mOGY3bG1zMGFxbzJtOHRxMDMwYmRwNjgxNXBmMzRmaS5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImF1ZCI6IjEwOTMxOTY4MDE0MjctZjhmN2xtczBhcW8ybTh0cTAzMGJkcDY4MTVwZjM0ZmkuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJzdWIiOiIxMTA0MjAwNTkzMjQwMDM1Mzg1NTgiLCJlbWFpbCI6ImFhbXV6YWtpaUBnbWFpbC5jb20iLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiYXRfaGFzaCI6InFYSV9pRkFhSlV5U1hETnRwb0FxYXciLCJuYW1lIjoiQWJkdWxsYWggQWwgTXV6YWtpIiwicGljdHVyZSI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hL0FBVFhBSnlXVXk4TVNFVWM0dm1OMHhFekpMdUtuSW5GNWE1Mml6LXl6V0dCTVE9czk2LWMiLCJnaXZlbl9uYW1lIjoiQWJkdWxsYWgiLCJmYW1pbHlfbmFtZSI6IkFsIE11emFraSIsImxvY2FsZSI6ImVuIiwiaWF0IjoxNjU2MTQzNjgxLCJleHAiOjE2NTYxNDcyODEsImp0aSI6ImM0MGMxYzBiYmJiZDZlZmNlMzA3OGRhYTYzMzg1OTY0YTMzZTNhMTAifQ.P9z3xYRN8LPZUfLW6fxBFVmuZFDPnCK8Zdc9lIl1Qwpld-pwoUWMhqql5WO7R0e7LZrZaC_19G4ciwRd9w22VBYXmRb05IDbytMe-7t3zF9Aox3Tmsb1jrBQ_GXICmLARsjT3VPFQJcX-pR4QNJQZurW25UjoWYWlq3btg81yRCPx4QqeQ6rpd_ZE8zN_iSVzKtQP2cmp5a-L_RiDzA02b6H-EnUK-qopY1KYJWVpIOBbmuKpdO-4q2K1Py6-tmdaoRH0pp1GqDqY3AhMJ1tLCW_QawNS7MS78EwBBgiFh9TzpYKXF0XcImk5po0t7Wojz72WmWS4y_w7mX4mPMKCw";
      GoogleIdToken idToken = verifier.verify(token);
      if (idToken != null) {
        Payload payload = idToken.getPayload();        
        String email = payload.getEmail();
        System.out.println("User EMAIL: " + email);
      }
    } catch (Exception e) {
      System.out.println("Error:" + e);
    }


    
  }
  
}
