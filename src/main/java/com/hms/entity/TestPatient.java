/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "test_patient")
public class TestPatient extends Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="test_patient_id")
    private Long testPatientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Test test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    @Column(name="test_date")
    private Timestamp testDate;

    @Column(name = "result_date")
    private Timestamp resultDate;

    @Column(name = "outcome")
    private String outcome;

    @Column(name = "status")
    private String status;

    @Column(name = "fees")
    private String fees;
}
