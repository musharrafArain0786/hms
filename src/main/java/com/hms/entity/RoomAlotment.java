/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "room_allotment")
public class RoomAlotment extends Models{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="room_alotment_id")
    private Long roomAlotmentId;

    @Column(name = "alotment_date")
    private Timestamp alotmentDate;

    @Column(name = "discharge_date")
    private Timestamp dischargeDate;

    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "fees")
    private String fees;

}
