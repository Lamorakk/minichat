package com.javaback.project.minichat.repository;

import com.javaback.project.minichat.model.User;
import com.javaback.project.minichat.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> { // Change from Long to String if using nickname as ID
    List<User> findAllByStatus(Status status);
}
