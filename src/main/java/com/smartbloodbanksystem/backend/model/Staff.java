package com.smartbloodbanksystem.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class Staff {
    @Id
    @Column(name = "staff_id")
    private Long id;

    private String firstName;
    private String lastName;
    private String password;
    private String gender;
    private  String address;
    private Date dob;
}
