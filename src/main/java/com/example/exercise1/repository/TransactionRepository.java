package com.example.exercise1.repository;

import com.example.exercise1.model.Customer;
import com.example.exercise1.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}