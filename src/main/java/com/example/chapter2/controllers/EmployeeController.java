package com.example.chapter2.controllers;

import com.example.chapter2.dto.EmployeeDTO;
import com.example.chapter2.entities.EmployeeEntity;
import com.example.chapter2.repositories.EmployeeRepository;
import com.example.chapter2.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{employeeID}")
    public EmployeeDTO getEmployeeByID(@PathVariable(name = "employeeID") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam (required = false) Integer age){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }
}
