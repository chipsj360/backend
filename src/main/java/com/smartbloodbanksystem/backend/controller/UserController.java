package com.smartbloodbanksystem.backend.controller;

//import com.smartbloodbanksystem.backend.model.Donor;
//import com.smartbloodbanksystem.backend.repository.DonorRepository;
//import com.smartbloodbanksystem.backend.service.DonorService;
import com.smartbloodbanksystem.backend.model.dto.AuthenticationRequest;
import com.smartbloodbanksystem.backend.model.dto.AuthenticationResponse;
import com.smartbloodbanksystem.backend.model.dto.RegisterRequest;
import com.smartbloodbanksystem.backend.model.dto.UserDto;
import com.smartbloodbanksystem.backend.service.CustomUserDetailsService;
import com.smartbloodbanksystem.backend.service.JwtUtil;
import com.smartbloodbanksystem.backend.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    private JwtUtil jwtUtil;
    @Autowired
    private CustomUserDetailsService customUserDetailsService;


    @PostMapping("signup")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }

    @PostMapping("signin")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        return ResponseEntity.ok(userService.authenticate(authenticationRequest));
    }

}
