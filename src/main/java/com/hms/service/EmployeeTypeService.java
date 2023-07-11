package com.hms.service;

import com.hms.model.request.EmployeeTypeRequest;

import java.util.List;

public interface EmployeeTypeService {
    public String add(EmployeeTypeRequest request);

    public List getAllEmployeeType();

    public String updateEmployeeTypeById(Long id,String employeeType);

    public String deleteEmployeeTypeById(Long id);
}
