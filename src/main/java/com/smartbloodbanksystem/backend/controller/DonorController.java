package com.smartbloodbanksystem.backend.controller;

import com.smartbloodbanksystem.backend.model.Donor;
import com.smartbloodbanksystem.backend.repository.DonorRepository;
import com.smartbloodbanksystem.backend.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DonorController {
    @Autowired
    private DonorRepository donorRepository;
    @Autowired
    DonorService donorService;
    @GetMapping("/viewDonor")
    public List< Donor> getAllDonors(){
        return donorRepository.findAll();
    }

    @PostMapping("/donor")
    public Donor addDonor(@RequestBody Donor donor){
        return donorRepository.save(donor);
    }
}
