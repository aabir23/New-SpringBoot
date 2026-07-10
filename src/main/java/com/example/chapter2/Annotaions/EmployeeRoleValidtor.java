package com.example.chapter2.Annotaions;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class EmployeeRoleValidtor implements ConstraintValidator<EmployeeRoleValidations,String> {
    @Override
    public boolean isValid(String inputRole, ConstraintValidatorContext constraintValidatorContext) {
        List<String> roles = List.of("USER", "ADMIN");
        return roles.contains(inputRole);
    }
}
