package com.example.CollegeManagementSystem.service;

import com.example.CollegeManagementSystem.model.Faculty;
import com.example.CollegeManagementSystem.repository.Facultyrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facultyservice {

    @Autowired
    private Facultyrepository facultyRepository;

    public Faculty addFaculty(Faculty faculty) {
        // Additional logic can be added here before saving the faculty
        return facultyRepository.save(faculty);
    }

    public List<Faculty> getFacultiesByCollegeName(String collegeName) {
        return facultyRepository.findByCollegeName(collegeName);
    }

    // Additional methods for other CRUD operations on faculties can be added here

}
