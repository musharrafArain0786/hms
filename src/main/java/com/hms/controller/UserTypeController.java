package com.hms.controller;

import com.hms.model.request.UserTypeRequest;
import com.hms.service.UserTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Api(tags = "user type")
@RestController
@RequestMapping("/api/userType")
public class UserTypeController {

    @Autowired
    UserTypeService userTypeService;
//    @ApiOperation(value = "add user type", notes = "executes add user endpoint")
    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody UserTypeRequest request){
      String response =  userTypeService.add(request);
        return ResponseEntity.ok().body(response);
    }
}
