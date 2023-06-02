package com.hms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private long employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "cnic")
    private String cnic;

    @Column(name = "contact")
    private String contact;

    @Column(name = "gender")
    private String gender;

    @Column(name = "salary")
    private long salary;

    @Column(name = "fees")
    private long fees;

    @Column(name = "address")
    private String address;

    @Column(name = "date_of_joining")
    private Timestamp dateOfJoining;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_type_id")
    private EmployeeType employeeType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blood_id")
    private Blood blood;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialization_id")
    private Specialization specialization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="shift_id")
    private Shift shift;

}
