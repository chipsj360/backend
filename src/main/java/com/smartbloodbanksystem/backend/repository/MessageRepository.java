package com.smartbloodbanksystem.backend.repository;

import com.smartbloodbanksystem.backend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
