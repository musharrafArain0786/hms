 
package com.hms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bill_id")
    private Long billId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_alotment_id")
    private RoomAlotment alotment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_patient_id")
    private TestPatient testPatient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "operation_result_id")
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
