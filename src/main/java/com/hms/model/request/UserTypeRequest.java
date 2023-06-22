package com.hms.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Getter
@Setter

public class UserTypeRequest {
    @ApiModelProperty(position=1)
    @Pattern(regexp = "^[a-zA-Z]*$",message = "user type must contain only Letters")
    @Size(min=4, message="usertype minSize(4)")
    @Size(max=20, message="user type maxSize(20)")
    @NotNull(message = "user type must not be null")
    private String userType;

    @Override
    public String toString() {
        return "UserTypeRequest{" +
                "userType='" + userType + '\'' +
                '}';
    }
}
