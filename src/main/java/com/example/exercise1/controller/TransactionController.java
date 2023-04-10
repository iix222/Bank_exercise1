package com.example.exercise1.controller;

import com.example.exercise1.service.TransactionService;
import org.springframework.stereotype.Controller;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */
@Controller
public class TransactionController {
    private TransactionService transactionService;
    public void setTransactionService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
}

