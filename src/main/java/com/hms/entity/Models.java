package com.hms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONPropertyIgnore;

import javax.persistence.*;
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
    @Column(name = "created_date")
    private Timestamp createdDate;

    @JsonIgnore
    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @JsonIgnore
    @Column(name = "active")
    private Integer active;


}
