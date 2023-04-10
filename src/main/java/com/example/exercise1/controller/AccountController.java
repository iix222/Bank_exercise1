package com.example.exercise1.controller;

import com.example.exercise1.model.Account;
import com.example.exercise1.model.Transaction;
import com.example.exercise1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    public void setAccountService(AccountService accountService) { this.accountService = accountService;}
}