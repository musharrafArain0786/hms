package com.hms.service.impl;

import com.hms.Utils.JsonUtility;
import com.hms.entity.EmployeeType;
import com.hms.service.EmployeeTypeService;
import com.hms.enums.ResponseMessage;
import com.hms.mapper.ModelToEntityMapper;
import com.hms.model.request.EmployeeTypeRequest;
import com.hms.repository.EmployeeTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeTypeServiceImpl implements EmployeeTypeService {

    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    @Override
    public String add(EmployeeTypeRequest request) {
        try {
            EmployeeType employeeType = employeeTypeRepository.save(ModelToEntityMapper.convertEmployeeTypeRequestToEntity(request,EmployeeType.class));
           // EmployeeType employeeType = ModelToEntityMapper.convertEmployeeTypeRequestToEntity(request,EmployeeType.class);
          //  EmployeeType employeeTypeEntity = employeeTypeRepository.save(employeeType);
            log.info("employee type id : {}",employeeType.getEmployeeTypeId());

        }catch (Exception ex){
            log.error("exception -> :  {}",ex.toString());
            JsonUtility.failure();
        }
        return JsonUtility.success(ResponseMessage.RECORD_ADD.getCode(), ResponseMessage.RECORD_ADD.getMessage());
    }
}
