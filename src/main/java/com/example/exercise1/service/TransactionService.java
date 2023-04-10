package com.example.exercise1.service;

import com.example.exercise1.model.Transaction;
import com.example.exercise1.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
