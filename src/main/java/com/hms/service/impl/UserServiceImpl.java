package com.hms.service.impl;

import com.hms.model.request.UserRequest;
import com.hms.repository.UserRespository;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRespository userRespository;

    @Override
    public String add(UserRequest request) {
//        userRespository.save(request);
    return "";
    }
}
