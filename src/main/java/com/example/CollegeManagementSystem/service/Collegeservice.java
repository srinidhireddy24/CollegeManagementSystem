package com.example.CollegeManagementSystem.service;

import com.example.CollegeManagementSystem.model.College;
import com.example.CollegeManagementSystem.repository.Collegerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Collegeservice {

    @Autowired
    private Collegerepository collegerepo;

    public College addCollege(College college) {
        // Additional logic can be added here before saving the college
        return collegerepo.save(college);
    }

    public List<College> getAllColleges() {
        return collegerepo.findAll();
    }

    public Optional<College> getCollegeById(Long id) {
        return collegerepo.findById(Math.toIntExact(id));
    }

    public Optional<College> getCollegeByName(String name) {
        return collegerepo.findByName(name);
    }

    public College updateCollegeName(Long id, String newName) {

        Optional<College> optionalCollege = collegerepo.findById(Math.toIntExact(id));
        if (optionalCollege.isPresent()) {
            College college = optionalCollege.get();
            college.setName(newName);
            return collegerepo.save(college);
        }
        return null; // Or throw exception indicating college not found
    }

    public void deleteCollegeById(Long id) {
        collegerepo.deleteById(Math.toIntExact(id));
    }

    // Additional methods for department and faculty associations can be added here

}