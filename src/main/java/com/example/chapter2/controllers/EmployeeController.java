package com.example.chapter2.controllers;

import com.example.chapter2.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/employees/{employeeID}")
    public EmployeeDTO getEmployeeByID(@PathVariable Long employeeID){
        return new EmployeeDTO(employeeID, "Aabir" , "aabir.aashir@gmail.com" , 27 , LocalDate.of(2025,1,1), true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam (required = false) Integer age){
        return "Hi age" + age;
    }

    @PostMapping
    public String getALL(){
        return "Hi from Post";
    }
}
