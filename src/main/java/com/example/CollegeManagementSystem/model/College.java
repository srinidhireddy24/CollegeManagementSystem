package com.example.CollegeManagementSystem.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    // Define one-to-many relationship with departments
    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Department> departments;
    public void setName(String name){

}


}