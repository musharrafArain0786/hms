package com.hms.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class UserController {
    public ResponseEntity<String> getAllUser(HttpServletRequest request){
        String response ="ok";
        return ResponseEntity.ok().body(response);
    }
}
