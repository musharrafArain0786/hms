package com.hms.controller;

import com.hms.Utils.JsonUtility;
import com.hms.enums.ResponseMessage;
import com.hms.model.request.UserTypeRequest;
import com.hms.service.UserTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;


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

        String  response =  userTypeService.add(request);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @ApiOperation(value = "get all users", notes = "executes getAllUserType endpoint")
    @GetMapping("/getAllUserType")
    public List getAllUserType()throws Exception{

        List list= userTypeService.getAllUserType();
        if(!list.isEmpty()){
            return list;
        }
        return Arrays.asList(JsonUtility.success(ResponseMessage.NO_RECORD_FOUND.getCode(), ResponseMessage.NO_RECORD_FOUND.getMessage()));
    }

    @ApiOperation(value = "get all users", notes = "executes getUserTypeById endpoint")
    @GetMapping("/getUserTypeById/{id}")
    public String getAllUserType(@PathVariable Long id)throws Exception{

       String userType = userTypeService.getUserTypeById(id);
       return userType;
    }

    @ApiOperation(value = "update user", notes = "executes update endpoint")
    @PutMapping("/updateUserTypeById/{id}")
    public String updateUserTypeById(@PathVariable Long id,@RequestBody UserTypeRequest userType)throws Exception{

        return userTypeService.updateUserTypeById(id,userType);
    }
    @ApiOperation(value = "delete user type", notes = "executes delete endpoint")
    @DeleteMapping("/deleteUserTypeById/{id}")
    public String deleteUserTypeById(@PathVariable Long id)throws Exception{

        return userTypeService.deleteUserTypeById(id);
    }
}
