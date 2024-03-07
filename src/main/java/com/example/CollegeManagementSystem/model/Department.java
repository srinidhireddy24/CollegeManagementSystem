package com.example.CollegeManagementSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    // Define many-to-one relationship with College
    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    public void setName(String name) {

}


}