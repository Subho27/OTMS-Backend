package com.project.examportalbackend.repository;

import com.project.examportalbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findUserByUserId(Long userId);
}
