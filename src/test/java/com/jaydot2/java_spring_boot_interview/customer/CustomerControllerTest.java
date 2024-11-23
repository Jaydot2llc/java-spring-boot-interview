package com.jaydot2.java_spring_boot_interview.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(MockitoExtension.class)
class CustomerControllerTest {

    @InjectMocks
    CustomerController customerController;

    MockMvc mockMvc;

    @Mock
    private CustomerService mockCustomerService;

    @BeforeEach
    void setUp() {
//        customerController = new CustomerController(mockCustomerService);
        mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
    }

    @Test
    void whenCustomerEndPointCalled_shouldReturnStatusOk() throws Exception {
        // Given

        // When
        mockMvc.perform(get("/customers")).andExpect(status().isOk());
        // Then
    }

    @Test
    void whenGetAllCustomers_returnShouldNotBeNull() {
        // Given
        List<Customer> expectedCustomers = List.of(Customer.builder()
                .id(1)
                .firstName("Joe")
                .lastName("Blow")
                .accountNumber(1111)
                .build());
        when(mockCustomerService.getAllCustomers()).thenReturn(expectedCustomers);
        // When
        List<Customer> actualCustomers = customerController.getAllCustomers();
        // Then
        assertNotNull(actualCustomers);
    }

    @Test
    void whenGetAllCustomersCalled_shouldCallCustomerService() {
        // Given

        // When
        customerController.getAllCustomers();
        // Then
        verify(mockCustomerService).getAllCustomers();
    }

    @Test
    void whenGetAllCustomers_shouldReturnExpectedCustomerListValues() {
        // Given
        List<Customer> expectedCustomers = List.of(Customer.builder()
                .id(1)
                .firstName("Joe")
                .lastName("Blow")
                .accountNumber(1111)
                .build());
        when(mockCustomerService.getAllCustomers()).thenReturn(expectedCustomers);
        // When
        List<Customer> actualCustomers = customerController.getAllCustomers();
        // Then
        assertTrue(actualCustomers.size() > 0);
        assertEquals(expectedCustomers.get(0).getFirstName(), actualCustomers.get(0).getFirstName());
    }
}