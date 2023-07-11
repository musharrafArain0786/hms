package com.hms.controller;

import com.hms.entity.EmployeeType;
import com.hms.model.request.EmployeeTypeRequest;
import com.hms.service.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
