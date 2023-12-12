package com.smartbloodbanksystem.backend.model.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private Long id;
    private String firstName;
    private String lastname;
    private String gender;
    private String bloodGroup;
    private Date dob;
    private double weight;
    private String userName;
    private String password;

    private String phoneNumber;
}
