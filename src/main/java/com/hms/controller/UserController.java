package com.hms.controller;

import com.hms.model.request.UserRequest;
import com.hms.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public ResponseEntity<String> getAllUser(){
        String response ="ok";
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/add")
    public ResponseEntity<String> addUser(@Valid @RequestBody UserRequest request){
        String res = "ok";
        return ResponseEntity.ok().body(res);
    }
}
