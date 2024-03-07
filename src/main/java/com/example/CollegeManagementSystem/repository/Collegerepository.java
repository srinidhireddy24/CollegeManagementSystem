
package com.example.CollegeManagementSystem.repository;

import com.example.CollegeManagementSystem.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Collegerepository extends JpaRepository<College,Integer> {


    Optional<College> findByName(String name);
}
