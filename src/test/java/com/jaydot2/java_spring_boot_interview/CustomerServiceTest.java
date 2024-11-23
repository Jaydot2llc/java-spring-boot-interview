package com.jaydot2.java_spring_boot_interview;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @InjectMocks
    CustomerService customerService;
    private CustomerRepository mockCustomerRepository;

    @Test
    void whenGetAllCustomers_shouldNotReturnNull() {
        // Given

        // When
        List<Customer> actualCustomers = customerService.getAllCustomers();
        // Then
        assertNotNull(actualCustomers);
    }

    @Test
    void whenGetAllCustomersCalled_shouldInvokeCustomerRepository() {
        // Given

        // When
        List<Customer> actualCustomers = customerService.getAllCustomers();
        // Then
        verify(mockCustomerRepository);
    }


}