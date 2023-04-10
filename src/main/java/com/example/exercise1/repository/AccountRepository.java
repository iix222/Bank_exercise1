package com.example.exercise1.repository;

import com.example.exercise1.model.Account;
import com.example.exercise1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Igor Grišin
 * @Date 4/10/2023
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByAccountNumber(Long accountId);
}