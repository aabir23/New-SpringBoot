package com.example.chapter2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String Email;
    private Integer age;
    private LocalDate dateOfJoining;
    private Boolean isActive;

}
