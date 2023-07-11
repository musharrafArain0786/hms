package com.hms.service.impl;

import com.hms.Utils.JsonUtility;
import com.hms.entity.EmployeeType;
import com.hms.mapper.ModelToEntityMapper;
import com.hms.service.EmployeeTypeService;
import com.hms.enums.ResponseMessage;
//import com.hms.mapper.ModelToEntityMapper;
import com.hms.model.request.EmployeeTypeRequest;
import com.hms.repository.EmployeeTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmployeeTypeServiceImpl implements EmployeeTypeService {

    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    @Override
    public String add(EmployeeTypeRequest request) {
        try {
            EmployeeType employeeType = employeeTypeRepository.save(ModelToEntityMapper.convertEmployeeTypeRequestToEntity(request,EmployeeType.class));
            log.info("employee type id : {}",employeeType.getEmployeeTypeId());
            return JsonUtility.success(ResponseMessage.RECORD_ADD.getCode(), ResponseMessage.RECORD_ADD.getMessage());

        }catch (Exception ex){
            log.error("exception -> :  {}",ex.toString());

        }
        return JsonUtility.success(ResponseMessage.UNKNOWN_ERROR.getCode(), ResponseMessage.UNKNOWN_ERROR.getMessage());
    }

    @Override
    public List getAllEmployeeType() {
        List<EmployeeType> employeeTypeList = new ArrayList<>();
        try{
            employeeTypeList = employeeTypeRepository.getAllEmplyeeType();

        }catch (Exception ex){
            log.error("exception : {}",ex.toString());
        }
        return employeeTypeList;
    }

    @Override
    public String updateEmployeeTypeById(Long id,String employeeType) {
        try {
            employeeTypeRepository.updateEmployeeTypeById(id,employeeType);
          return JsonUtility.success(ResponseMessage.RECORD_UPDATED.getCode(),ResponseMessage.RECORD_UPDATED.getMessage());

        }catch (Exception ex){
            log.error("exception : {}",ex.toString());
        }
        return JsonUtility.success(ResponseMessage.NO_RECORD_FOUND.getCode(),ResponseMessage.NO_RECORD_FOUND.getMessage());
    }

    @Override
    public String deleteEmployeeTypeById(Long id) {
        try {
            employeeTypeRepository.deleteEmployeeTypeById(id);
            return JsonUtility.success(ResponseMessage.RECORD_DELETE.getCode(),ResponseMessage.RECORD_DELETE.getMessage());
        }catch (Exception ex){
            log.error("exception : {}",ex.toString());
        }
        return JsonUtility.success(ResponseMessage.NO_RECORD_FOUND.getCode(),ResponseMessage.NO_RECORD_FOUND.getMessage());
    }
}
