package com.example.springJPA.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account_ManyToOne_bi")
public class Account {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String accountNumber;
    String fullName;
    BigDecimal balance;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id")
    Branch branch;

	public Account() {
	}

	public Account(Integer id, String accountNumber, String fullName, BigDecimal balance, Branch branch) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		this.balance = balance;
		this.branch = branch;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
    
    

}
