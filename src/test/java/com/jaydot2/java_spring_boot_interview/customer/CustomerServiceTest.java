package com.jaydot2.java_spring_boot_interview.customer;

import com.jaydot2.java_spring_boot_interview.customer.Customer;
import com.jaydot2.java_spring_boot_interview.customer.CustomerRepository;
import com.jaydot2.java_spring_boot_interview.customer.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @InjectMocks
    CustomerService customerService;

    @Mock
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
        verify(mockCustomerRepository).findAll();
    }

    @Test
    void whenGetAllCustomerCalled_shouldReturnCustomerList() {
        // Given
        Iterable<Customer> expectedCustomers = List.of(Customer.builder()
                .id(1)
                .firstName("Joe")
                .lastName("Blow")
                .accountNumber(1111)
                .build());
        when(mockCustomerRepository.findAll()).thenReturn(expectedCustomers);
        // When
        List<Customer> actualCustomers = customerService.getAllCustomers();
        // Then
        assertNotNull(actualCustomers);
        assertTrue(actualCustomers.size() > 0);
    }

}