package com.jaydot2.java_spring_boot_interview.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account/{accountNumber}")
    public Account getAccountByAccountNumber(@PathVariable Integer accountNumber) {
        return null;
    }
}
