package com.example.springJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springJPA.model.Account;
import com.example.springJPA.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping("/Bi/Employee")
	public ResponseEntity<List<Account>> createEmployee(@RequestBody List<Account> user) {
		List<Account> actualUser = accountRepository.saveAll(user);
		return ResponseEntity.ok(actualUser);
	}
	
	
	@GetMapping("/account/{accountNumber}")
	public ResponseEntity<?> getAccount(@PathVariable("accountNumber") String accountNumber){
		List<Account> users = accountRepository.findAccount(accountNumber);
		return new ResponseEntity<>(users, HttpStatus.OK);
		
	}
	
}

