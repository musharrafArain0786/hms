package com.hms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum ResponseMessge {

    SUCCESS("00","Success"),
    UNKNOWN_ERROR("500","Unknown Error");

    private String code;
    private String message;
}
