package com.hms.controller;

import com.hms.Utils.JsonUtility;
import com.hms.model.request.UserTypeRequest;
import com.hms.service.UserTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;



@Slf4j
@Api(tags = "user type")
@RestController
@RequestMapping("/api/userType")
public class UserTypeController {

    @Autowired
    UserTypeService userTypeService;

    @ApiOperation(value = "add user type", notes = "executes add user endpoint")
    @PostMapping("/add")
    public ResponseEntity<String> add(@Valid @RequestBody UserTypeRequest request)throws Exception{
//        String response="ok";

           String  response =  userTypeService.add(request);

        return new ResponseEntity<>(response,HttpStatus.OK);

    }
}
