package com.example.CollegeManagementSystem.service;

import com.example.CollegeManagementSystem.model.Department;
import com.example.CollegeManagementSystem.repository.Departmentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Departmentservice {

    @Autowired
    private Departmentrepository departmentrepo;

    public Department addDepartment(Department department) {
        // Additional logic can be added here before saving the department
        return departmentrepo.save(department);
    }

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentrepo.findByCollegeName(collegeName);
    }

    // Additional methods for other CRUD operations on departments can be added here

}