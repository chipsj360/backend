package com.smartbloodbanksystem.backend.service;



import com.smartbloodbanksystem.backend.model.User;

import com.smartbloodbanksystem.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAll(){
        return   userRepository.findAll();
    }
}


