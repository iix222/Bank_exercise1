package com.example.exercise1.controller;

import com.example.exercise1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}