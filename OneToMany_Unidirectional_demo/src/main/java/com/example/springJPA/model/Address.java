package com.example.springJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_OneToMany_uni")
public class Address {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int address_id;
	private String city;
	private String addressType;
	
	public Address(int address_id, String city, String addressType) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.addressType = addressType;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	

}
