package com.javaback.project.minichat.repository;

import com.javaback.project.minichat.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<ChatMessage, Long> {
    // You can define custom database queries here if needed
}
