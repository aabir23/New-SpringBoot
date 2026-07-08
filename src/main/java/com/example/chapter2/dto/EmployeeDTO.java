package com.example.chapter2.dto;

import java.time.LocalDate;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String Email;
    private Integer age;
    private LocalDate  dateOfJoining;
    private Boolean isActive;

    public EmployeeDTO(String employeeID, String aabir, String mail, int age, LocalDate dateOfJoining, boolean isActive){

    }

    public EmployeeDTO(Long id, String email, String name, Integer age, LocalDate dateOfJoining, Boolean isActive) {
        this.id = id;
        Email = email;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
