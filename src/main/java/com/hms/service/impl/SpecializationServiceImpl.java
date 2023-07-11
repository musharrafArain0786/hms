package com.hms.service.impl;

import com.hms.Utils.JsonUtility;
import com.hms.entity.Specialization;
import com.hms.enums.ResponseMessage;
import com.hms.mapper.ModelToEntityMapper;
import com.hms.model.request.SpecializationRequest;
import com.hms.repository.SpeciliazationRepository;
import com.hms.service.SpecializationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SpecializationServiceImpl implements SpecializationService {

    @Autowired
    SpeciliazationRepository speciliazationRepository;

    @Override
    public String add(SpecializationRequest specializationRequest) {
        try {
            Specialization specialization = speciliazationRepository.save(ModelToEntityMapper.convertSpecializationRequestToEntity(specializationRequest,Specialization.class));
            log.info("specialization id:  {}",specialization.getSpecializationId());

        }catch (Exception ex){
            log.info("exception -> : {}",ex.toString());
        }
        return JsonUtility.success(ResponseMessage.RECORD_ADD.getCode(), ResponseMessage.RECORD_ADD.getMessage());
    }

}
