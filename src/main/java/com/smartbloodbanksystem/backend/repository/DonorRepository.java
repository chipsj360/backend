package com.smartbloodbanksystem.backend.repository;

import com.smartbloodbanksystem.backend.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor,Long> {
}
