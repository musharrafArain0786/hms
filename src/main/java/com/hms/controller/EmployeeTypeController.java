package com.hms.controller;

import com.hms.model.request.EmployeeTypeRequest;
import com.hms.service.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employeeType")
public class EmployeeTypeController {

    @Autowired
    EmployeeTypeService employeeTypeService;

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody EmployeeTypeRequest employeeTypeRequest){
        String response = employeeTypeService.add(employeeTypeRequest);
        return ResponseEntity.ok().body(response);
    }
}
