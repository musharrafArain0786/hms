
package com.hms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "ward")
public class Ward extends Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ward_id")
    private Long wardId;

    @Column(name = "name")
    private String name;

}
