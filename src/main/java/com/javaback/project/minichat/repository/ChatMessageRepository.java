package com.javaback.project.minichat.repository;

import com.javaback.project.minichat.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, String> {
    List<ChatMessage> findByChatId(String chatId);
}