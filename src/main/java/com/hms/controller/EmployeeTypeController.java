package com.hms.controller;

import com.hms.constants.ERoleConstants;
import com.hms.entity.EmployeeType;
import com.hms.model.request.EmployeeTypeRequest;
import com.hms.service.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@SecurityRequirement(name = "bearerAuth")
//@Tag(name = "User", description = "The User API. Contains all the operations that can be performed on a user.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/employeeType")
public class EmployeeTypeController {

    @Autowired
    EmployeeTypeService employeeTypeService;

    @PreAuthorize(ERoleConstants.ROLE_ADMIN)
    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody EmployeeTypeRequest employeeTypeRequest){
        String response = employeeTypeService.add(employeeTypeRequest);
        return ResponseEntity.ok().body(response);
    }

    @PreAuthorize(ERoleConstants.ROLE_ADMIN)
    @GetMapping("/getAllEmployeeType")
    public List<EmployeeType> getAllEmployeeType(){

        return employeeTypeService.getAllEmployeeType();
    }

    @PutMapping("/updateEmployeeTypeById")
    public String updateEmployeeTypeById(@PathVariable Long id,String employeeType){
      return employeeTypeService.updateEmployeeTypeById(id,employeeType);
    }

    @DeleteMapping("/deleteEmployeeById")
    public String deleteEmployeeTypeById(@PathVariable long id){
       return employeeTypeService.deleteEmployeeTypeById(id);
    }

}
