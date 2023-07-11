
package com.hms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "equipment")
public class Equipment extends Models{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="equipment_id")
    private Long equipmentId;

    @Column(name = "equipment_name")
    private String equipmentName;

    @Column(name = "warrenty")
    private String warrenty;

    @Column(name = "manufactures")
    private String manufactures;

    @Column(name = "quality")
    private String quality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_type_id")
    private EquipmentType equipmentType;

    @Column(name = "purchase_date")
    private Timestamp purchaseDate;


}
