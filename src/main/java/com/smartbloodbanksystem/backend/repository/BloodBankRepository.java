package com.smartbloodbanksystem.backend.repository;

import com.smartbloodbanksystem.backend.model.BloodBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodBankRepository extends JpaRepository<BloodBank,Long> {
}
