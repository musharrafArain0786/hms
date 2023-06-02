/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "shift")
public class Shift extends Models{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shift_id")
    private Long shiftId;

    @Column(name = "shift")
    private String shift;

    @Column(name="timing_from")
    private String timingFrom;

    @Column(name="timing_to")
    private String timingTo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;


}
