package com.hms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "equipment_type")
public class EquipmentType extends Models{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="equipment_type_id")
    private Long equipmentTypeId;

    @Column(name = "equipment_type")
    private String equipmentType;


}
