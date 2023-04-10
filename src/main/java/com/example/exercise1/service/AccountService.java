package com.example.exercise1.service;

import com.example.exercise1.model.Account;
import com.example.exercise1.model.Transaction;
import com.example.exercise1.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Optional<Account> getAccountInfoByAccountNumber(Long accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

    public void createAccount(Account account) {
    }
}

