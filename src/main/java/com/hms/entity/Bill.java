
package com.hms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bill")
public class Bill {

    @Column(name = "room_alotment")
    private RoomAlotment alotment;

    @Column(name = "test_patient")
    private TestPatient testPatient;

    @Column(name = "operation_result")
    private OperationResult operationResult;

    @Column(name = "totadays")
    private Integer totaDays;

    @Column(name = "grand_total")
    private Integer grandTotal;

    @Column(name = "total_test_charges")
    private Integer totalTestCharges;

    @Column(name="total_operation_charges")
    private Integer totalOperationCharges;


}
