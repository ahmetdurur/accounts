package com.folksdev.account;

import com.folksdev.account.model.Account;
import com.folksdev.account.model.Customer;
import com.folksdev.account.repository.AccountRepository;
import com.folksdev.account.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

	private final CustomerRepository customerRepository;
	private final AccountRepository accountRepository;

	public AccountApplication(CustomerRepository customerRepository, AccountRepository accountRepository) {
		this.customerRepository = customerRepository;
		this.accountRepository = accountRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}


	@Override
	public void run(String... args) {
		/*Account a = new Account("a", BigDecimal.ONE, LocalDateTime.now(), null , SetsKt.emptySet());
		Account b = new Account("a", BigDecimal.ONE, LocalDateTime.now(), null , SetsKt.emptySet());*/

		/*Account account = accountRepository.save(new Account(null, new BigDecimal(20), LocalDateTime.now()));
		HashSet<Account> hsAc = new HashSet<Account>();
		hsAc.add(account);*/
		Customer customer = customerRepository.save(new Customer("Erol", "asda"));
		//Customer customer2 = customerRepository.save(new Customer("Alice", "Bob"));

		System.out.println(customer);
		//System.out.println(customer2);
	}
}
