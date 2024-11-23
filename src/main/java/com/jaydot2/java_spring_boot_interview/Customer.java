package com.jaydot2.java_spring_boot_interview;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private int accountNumber;
}
