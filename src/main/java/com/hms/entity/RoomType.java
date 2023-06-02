package com.hms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "room_type")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="room_type_id")
    private Long roomTypeId;

    @Column(name="room_type")
    private String roomType;

    @Column(name = "room_charges")
    private String roomCharges;


    
}
