package com.example.chapter2.dto;

import com.example.chapter2.Annotaions.EmployeeRoleValidations;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    @NotBlank(message = "Required Name")
    private String name;
    private String Email;
    @Max(value = 80)
    @Min(value = 18)
    @NotNull
    private Integer age;
    @EmployeeRoleValidations
    private String role;
    @PastOrPresent(message = "Date must be in past")
    private LocalDate  dateOfJoining;
    private Boolean isActive;
}
