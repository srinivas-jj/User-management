package com.alwinsimon.UserManagementJavaSpringBoot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alwinsimon.UserManagementJavaSpringBoot.Model.User;


public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findByEmail(String email);

    @Override
    void deleteById(Long id);
}