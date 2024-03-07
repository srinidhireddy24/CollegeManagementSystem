package com.example.CollegeManagementSystem.repository;

import com.example.CollegeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Departmentrepository extends JpaRepository<Department,Integer> {


    List<Department> findByCollegeName(String collegeName);
}