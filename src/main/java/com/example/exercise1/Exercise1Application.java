package com.example.exercise1;

import com.example.exercise1.model.Account;
import com.example.exercise1.model.Customer;
import com.example.exercise1.model.Transaction;
import com.example.exercise1.service.AccountService;
import com.example.exercise1.service.CustomerService;
import com.example.exercise1.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@SpringBootApplication
public class Exercise1Application {

	@Component
	public class CommandLineRunnerImpl implements CommandLineRunner {

		@Autowired
		private CustomerService customerService;

		@Autowired
		private AccountService accountService;

		@Autowired
		private TransactionService transactionService;

		@Override
		public void run(String... args) throws Exception {
			// Create a customer
			Customer customer = new Customer();
			customer.setFirstname("John");
			customer.setLastname("Doe");
			customer.setPhonenumber(1234567890L);
			customerService.createCustomer(customer);

			// Create an account for the customer
			Account account = new Account();
			account.setCustomerId(customer.getId());
			account.setAccountNumber(123456789L);
			account.setBalance(Long.valueOf(1000));
			accountService.createAccount(account);

			// Create a transaction for the account
			Transaction transaction = new Transaction();
			transaction.setAccountId(account.getId());
			transaction.setType("Deposit");
			transaction.setAmount(Long.valueOf(500));
			transactionService.createTransaction(transaction);
		}
	}
}