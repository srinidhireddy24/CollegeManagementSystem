package com.example.CollegeManagementSystem.repository;

import com.example.CollegeManagementSystem.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Facultyrepository extends JpaRepository<Faculty,Integer> {


    List<Faculty> findByCollegeName(String collegeName);
}
