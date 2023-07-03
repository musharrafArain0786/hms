package com.hms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseMessage {

    SUCCESS("00","success"),
    NO_RECORD_FOUND("00","no record found"),
    RECORD_ADD("00","record successfully add"),

    RECORD_UPDATED("00","record updated"),
    UNKNOWN_ERROR("500","Unknown Error"),

    RECORD_DELETE("00","record delete successfully");


    private String code;
    private String message;
}
