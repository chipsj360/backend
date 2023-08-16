package com.smartbloodbanksystem.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Results {
    @Id
    @Column(name="results_id")
    private Long id;
    private String hiv;
    private String hepatitisA;
    private String hepatitisB;
    private String hepatitisC;
    @OneToOne
    @JoinColumn(name = "blood_id", referencedColumnName = "blood_id")
    private Blood blood;
}
