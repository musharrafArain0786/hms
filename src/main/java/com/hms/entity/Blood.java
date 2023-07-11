
package com.hms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "blood")
public class Blood extends Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="blood_id")
    private Long bloodId;

    @Column(name = "blood_group")
    private String bloodGroup;


}
