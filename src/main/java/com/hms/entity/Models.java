package com.hms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@MappedSuperclass
public class Models {

    @JsonIgnore
    @Column(name = "created_by")
    private Integer createdBy;

    @JsonIgnore
    @Column(name = "modified_by")
    private Integer modifiedBy;

    @JsonIgnore
    @Column(name="created_date",columnDefinition = "timestamp default current_timestamp")
    private Timestamp timestamp;

    @JsonIgnore
    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @JsonIgnore
    @Column(name = "active",columnDefinition = "integer default 1")
    private Integer active=1;


}
