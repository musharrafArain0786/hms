package com.hms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "specialization")
public class Specialization extends Models{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="specialization_id")
    private Long specializationId;

    @Column(name = "specialization")
    private String specialization;


}
