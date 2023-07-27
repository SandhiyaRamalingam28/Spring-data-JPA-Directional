package com.example.springJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springJPA.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	
	@Query("select a from Account a where a.accountNumber = ?1")
    public List<Account> findAccount(String accountNumber);

}
