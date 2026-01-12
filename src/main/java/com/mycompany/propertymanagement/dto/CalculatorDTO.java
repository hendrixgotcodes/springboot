package com.mycompany.propertymanagement.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
public class CalculatorDTO {
    private Double num1;
    private Double num2;
    private Double num3;
    private Double num4;
}
