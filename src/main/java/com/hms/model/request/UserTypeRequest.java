package com.hms.model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserTypeRequest {
//    @ApiModelProperty(position=1)
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
