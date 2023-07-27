package com.example.springJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Branch_ManyToOne_uni")
public class Branch {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String branchCode;
    String branchName;
    
    
	public Branch() {
	}


	public Branch(Integer id, String branchCode, String branchName) {
		super();
		this.id = id;
		this.branchCode = branchCode;
		this.branchName = branchName;
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

    
}
