package com.hms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee_type")
public class EmployeeType extends Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_type_id")
    private Long employeeTypeId;

    @Column(name="employee_type")
    private String employeeType;


}
