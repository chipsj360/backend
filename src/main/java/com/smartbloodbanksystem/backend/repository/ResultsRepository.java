package com.smartbloodbanksystem.backend.repository;

import com.smartbloodbanksystem.backend.model.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends JpaRepository<Results,Long> {
}
