package com.hms.mapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserTypeModel {
    private String userType;

    @Override
    public String toString() {
        return "UserTypeModel{" +
                "userType='" + userType + '\'' +
                '}';
    }
}
