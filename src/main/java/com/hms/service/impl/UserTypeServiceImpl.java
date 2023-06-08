package com.hms.service.impl;

import com.hms.Utils.JsonUtility;
import com.hms.entity.UserType;
import com.hms.model.request.UserTypeRequest;
import com.hms.repository.UserTypeRepository;
import com.hms.service.UserTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    UserTypeRepository userTypeRepository;

    @Override
    public String add(UserTypeRequest request) {
     try {

         UserType usertype = JsonUtility.convertJsonToEntity(request, UserType.class);
         UserType us = userTypeRepository.save(usertype);
         return JsonUtility.success();


     }catch (Exception ex){
         log.error("error -> {}",ex.toString());
         return JsonUtility.failure();
     }

    }

}
