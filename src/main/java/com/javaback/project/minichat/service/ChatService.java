//package com.javaback.project.minichat.service;
//
//import com.javaback.project.minichat.model.Message;
//import com.javaback.project.minichat.repository.MessageRepository;
//import com.javaback.project.minichat.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class ChatService {
//    @Autowired
//    private MessageRepository messageRepository;
//    @Autowired
//    private UserRepository userRepository; // This is now using AppUser
//
//    public List<Message> getMessagesByUser(Long userId) {
//        return messageRepository.findByUserId(userId);
//    }
//        // Additional methods for adding messages, etc.
//}
