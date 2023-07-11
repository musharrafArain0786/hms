package com.hms.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hms.Utils.JsonUtility;
import com.hms.enums.config.Config;
import com.hms.entity.UserType;

import com.hms.enums.ResponseMessage;
import com.hms.mapper.ModelToEntityMapper;
import com.hms.mapper.UserTypeModel;
import com.hms.model.request.UserTypeRequest;
import com.hms.repository.UserTypeRepository;
import com.hms.service.UserTypeService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserTypeServiceImpl implements UserTypeService {

    private static final Gson GSON = new GsonBuilder().create();
    @Autowired
    UserTypeRepository userTypeRepository;

    @Autowired
    private Config config;

    @Override
    public String add(UserTypeRequest request) {
     try {

         UserType usertype = ModelToEntityMapper.convertUserTypeRequestToEntity(request, UserType.class);
         UserType us = userTypeRepository.save(usertype);
         log.info("user type id {}:  ",us.getUserTypeId());

     }catch (Exception ex){
         log.error("error -> {}",ex.toString());
         return JsonUtility.failure();
     }
        return JsonUtility.success(ResponseMessage.SUCCESS.getCode(), ResponseMessage.SUCCESS.getMessage());
    }
    private static final ModelMapper modelMapper = new ModelMapper();
    @Override
    public List getAllUserType() {
        List<UserType> userTypeList = new ArrayList<>();

       try{
           userTypeList =  userTypeRepository.getAllUserType();

       }catch (Exception ex){
            log.error("exception : {}",ex.toString());
       }
        return userTypeList;
    }

    @Override
    public String getUserTypeById(Long id) {
        try {
            Optional<UserType> userType = userTypeRepository.findById(id);
            if (userType.isPresent()) {
                return GSON.toJson(config.modelMapper().map(userType, UserTypeModel.class));
            }
        }catch (Exception ex){
            log.error("exception : {}",ex.toString());
        }
       return JsonUtility.success(ResponseMessage.NO_RECORD_FOUND.getCode(),ResponseMessage.NO_RECORD_FOUND.getMessage());
    }

    @Override
    public String updateUserTypeById(Long id,UserTypeRequest userTypeRequest) {
        try {
            Optional<UserType> userType = userTypeRepository.findById(id);
            if (userType.isPresent()) {

                ModelToEntityMapper.convertUserTypeRequestToEntity(userTypeRequest, UserType.class);
                userTypeRepository.updateUserTypeById(id, userTypeRequest.getUserType());

                return JsonUtility.success(ResponseMessage.RECORD_UPDATED.getCode(), ResponseMessage.RECORD_UPDATED.getMessage());
            }
        }catch(Exception ex){
            log.error("exception : {}",ex.toString());
        }
        return JsonUtility.success(ResponseMessage.NO_RECORD_FOUND.getCode(),ResponseMessage.NO_RECORD_FOUND.getMessage());

    }

    @Override
    public String deleteUserTypeById(Long id) {
        try{
       Optional<UserType> userType = userTypeRepository.findById(id);
        if (userType.isPresent()){
            userTypeRepository.deleteUserTypeById(id);
            return JsonUtility.success(ResponseMessage.RECORD_DELETE.getCode(),ResponseMessage.RECORD_DELETE.getMessage());
        }
        }catch(Exception ex){
            log.error("exception : {}",ex.toString());
        }
        return JsonUtility.success(ResponseMessage.NO_RECORD_FOUND.getCode(),ResponseMessage.NO_RECORD_FOUND.getMessage());
    }


}
