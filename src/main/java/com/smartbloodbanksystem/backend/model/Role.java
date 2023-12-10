package com.smartbloodbanksystem.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



public enum Role {

    USER,
    ADMIN;

//    @Id
//    @Column(name = "role_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
}
