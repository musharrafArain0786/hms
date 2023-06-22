package com.hms.service.impl;

import com.hms.Utils.JsonUtility;
import com.hms.entity.Blood;
import com.hms.mapper.ModelToEntityMapper;
import com.hms.model.request.BloodRequest;
import com.hms.repository.BloodRepository;
import com.hms.service.BloodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BloodServiceImpl implements BloodService {

    @Autowired
    BloodRepository bloodRepository;

    @Override
    public String add(BloodRequest bloodRequest) {
        try {
            Blood blood = ModelToEntityMapper.convertBloodRequestToEntity(bloodRequest,Blood.class);
            Blood bloodEntity = bloodRepository.save(blood);
            log.info("blood id : {}",bloodEntity.getBloodId());

            return JsonUtility.success();
        }catch (Exception ex){
            log.error("exception -> :  {}",ex.toString());
            return JsonUtility.failure();
        }
    }
}
