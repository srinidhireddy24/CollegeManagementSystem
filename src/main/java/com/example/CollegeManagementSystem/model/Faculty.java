package com.example.CollegeManagementSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "faculty")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    // Define many-to-one relationship with College
    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    // Define many-to-one relationship with Department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}