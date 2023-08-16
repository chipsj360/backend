package com.smartbloodbanksystem.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class BloodBank {
    @Id
    @Column(name="bloodBank_id")
    @GeneratedValue
    private Long id;
    private double quantity;
    private String bloodGroup;
    private Date date;

}
