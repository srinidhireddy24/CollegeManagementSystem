package com.example.CollegeManagementSystem.controller;

import com.example.CollegeManagementSystem.model.Department;
import com.example.CollegeManagementSystem.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class Departmentcontroller {

    @Autowired
    private Departmentservice departmentService;

    @PostMapping("/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department addedDepartment = departmentService.addDepartment(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedDepartment);
    }

    @GetMapping("/college/{collegeName}")
    public ResponseEntity<List<Department>> getDepartmentsByCollegeName(@PathVariable String collegeName) {
        List<Department> departments = departmentService.getDepartmentsByCollegeName(collegeName);
        return ResponseEntity.ok(departments);
    }

    // Additional endpoints for other CRUD operations on departments can be added here

}