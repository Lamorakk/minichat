package com.javaback.project.minichat.service;

import com.javaback.project.minichat.model.Status;
import com.javaback.project.minichat.model.User;
import com.javaback.project.minichat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void saveUser(User user) {
        user.setStatus(Status.ONLINE); // Consider if admin needs different handling
        repository.save(user);
    }

    public void disconnect(User user) {
        User storedUser = repository.findById(user.getNickName()).orElse(null);
        if (storedUser != null) {
            storedUser.setStatus(Status.OFFLINE);
            repository.save(storedUser);
        }
    }

    public List<User> findConnectedUsers() {
        return repository.findAllByStatus(Status.ONLINE);
    }
}
