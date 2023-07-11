package com.hms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "operation_result")
public class OperationResult extends Models{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="operation_result_id")
    private Long operationResultId;

    @Column(name = "result")
    private String result;

    @Column(name = "status")
    private String status;

    @Column(name = "fees")
    private String fees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "operation_id")
    private Operation operation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appoitment_id")
    private Appointment appointment;

    @Column(name = "operation_date")
    private Timestamp operationDate;


    
}
