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
@Table(name = "patient")
public class Patient extends Models{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="")
    private Long patientId;

    @Column(name = "name")
    private String name;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "contact")
    private String contact;

    @Column(name = "address")
    private String address;

    @Column(name = "createdBy")
    private Integer createdBy;

    @Column(name = "modifiedBy")
    private Integer modifiedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blood_id")
    private Blood blood;


}
