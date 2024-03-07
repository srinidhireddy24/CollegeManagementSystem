package com.example.CollegeManagementSystem.controller;

import com.example.CollegeManagementSystem.model.College;
import com.example.CollegeManagementSystem.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/colleges")
public class Collegecontroller {

    @Autowired
    private Collegeservice collegeService;

    @PostMapping("/add")
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        College addedCollege = collegeService.addCollege(college);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedCollege);
    }

    @GetMapping("/all")
    public ResponseEntity<List<College>> getAllColleges() {
        List<College> colleges = collegeService.getAllColleges();
        return ResponseEntity.ok(colleges);
    }

    @GetMapping("/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable Long id) {
        Optional<College> college = collegeService.getCollegeById(id);
        return college.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<College> getCollegeByName(@PathVariable String name) {
        Optional<College> college = collegeService.getCollegeByName(name);
        return college.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<College> updateCollegeName(@PathVariable Long id, @RequestParam String newName) {
        College updatedCollege = collegeService.updateCollegeName(id, newName);
        if (updatedCollege != null) {
            return ResponseEntity.ok(updatedCollege);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCollegeById(@PathVariable Long id) {
        collegeService.deleteCollegeById(id);
        return ResponseEntity.noContent().build();
    }

    // Additional endpoints for other CRUD operations on colleges can be added here

}