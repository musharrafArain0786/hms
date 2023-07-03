package com.hms.service;

import com.hms.model.request.UserTypeRequest;

import java.util.List;

public interface UserTypeService {
    public String add(UserTypeRequest request);

    public List getAllUserType();

    public String getUserTypeById(Long id);

    public String updateUserTypeById(Long id,UserTypeRequest userTypeRequest);

    public String deleteUserTypeById(Long id);
}
