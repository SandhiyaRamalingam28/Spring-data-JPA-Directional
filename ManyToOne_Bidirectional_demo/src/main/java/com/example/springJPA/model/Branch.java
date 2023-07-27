package com.example.springJPA.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Branch_ManyToOne_bi")
public class Branch {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String branchCode;
    String branchName;
    
    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    List<Account> account;
    
	public Branch() {
	}

	public Branch(Integer id, String branchCode, String branchName, List<Account> account) {
		super();
		this.id = id;
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}


    
}
