package com.jaydot2.java_spring_boot_interview.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class AccountControllerTest {

    @InjectMocks
    AccountController accountController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(accountController).build();
    }

    @Test
    void whenAccountEndpointIsCalled_thenReturnStatusIsOk() throws Exception {
        // Given
        Integer fakeAccountNumber = 1234;
        // When
        mockMvc.perform(get("/account/{accountNumber}", fakeAccountNumber)).andExpect(status().isOk());

        // Then
    }

    @Test
    void whenAccountEndpointIsCalled_thenReturnAccount() {
        // Given

        // When
//        Account actualAccount = accountController;

        // Then
    }
}