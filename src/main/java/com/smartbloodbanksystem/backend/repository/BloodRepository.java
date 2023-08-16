package com.smartbloodbanksystem.backend.repository;

import com.smartbloodbanksystem.backend.model.Blood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodRepository extends JpaRepository<Blood,Long> {
}
