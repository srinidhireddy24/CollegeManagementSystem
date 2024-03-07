package com.example.CollegeManagementSystem.controller;

import com.example.CollegeManagementSystem.model.Faculty;
import com.example.CollegeManagementSystem.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculties")
public class Facultycontroller {

    @Autowired
    private Facultyservice facultyService;

    @PostMapping("/add")
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        Faculty addedFaculty = facultyService.addFaculty(faculty);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedFaculty);
    }

    @GetMapping("/college/{collegeName}")
    public ResponseEntity<List<Faculty>> getFacultiesByCollegeName(@PathVariable String collegeName) {
        List<Faculty> faculties = facultyService.getFacultiesByCollegeName(collegeName);
        return ResponseEntity.ok(faculties);
    }

    // Additional endpoints for other CRUD operations on faculties can be added here

}