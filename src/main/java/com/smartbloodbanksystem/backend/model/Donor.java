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
public class Donor {
    @Id
    @GeneratedValue
    @Column(name="donor_id")
    Long id;
    private String firstName;
    private String lastname;
    private String gender;
    private String bloodGroup;
    private Date dob;
    private double weight;
    private String userName;
    private String password;

    private int phoneNumber;

}
