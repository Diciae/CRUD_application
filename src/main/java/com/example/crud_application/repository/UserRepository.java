package com.example.crud_application.repository;

import com.example.crud_application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

}
