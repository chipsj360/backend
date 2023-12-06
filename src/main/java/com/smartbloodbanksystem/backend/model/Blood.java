package com.smartbloodbanksystem.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Blood {
    @Id
    @GeneratedValue
    @Column(name = "blood_id")
    private Long id;
    private String bloodGroup;
    private int phoneNumber;

    private double currentQuantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="donor_id", referencedColumnName="donor_id")
    private Donor donor;
}
