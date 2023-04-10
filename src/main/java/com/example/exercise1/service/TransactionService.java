package com.example.exercise1.service;

import com.example.exercise1.TransactionType;
import com.example.exercise1.model.Account;
import com.example.exercise1.model.Transaction;
import com.example.exercise1.repository.AccountRepository;
import com.example.exercise1.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.example.exercise1.TransactionType.DEPOSIT;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */
@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Transaction createTransaction(Transaction transaction) throws Exception {

        Optional<Account> optionalAccount = accountRepository.findById(transaction.getAccountId());
        if (!optionalAccount.isPresent()) {
            throw new Exception("Account not found");
        }
        Account account = optionalAccount.get();


        if (transaction.getType().equals (TransactionType.DEPOSIT)) {
            account.setBalance(account.getBalance() + transaction.getAmount());
        } else if (transaction.getType().equals (TransactionType.WITHDRAWAL)) {
            if (account.getBalance() < transaction.getAmount()) {
                throw new Exception("Insufficient balance");
            }
            account.setBalance(account.getBalance() - transaction.getAmount());
        }

        // save the updated account and the new transaction
        accountRepository.save(account);
        return transactionRepository.save(transaction);
    }

}
