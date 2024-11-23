package com.jaydot2.java_spring_boot_interview;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        return customers;
    }
}
