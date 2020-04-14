package com.users.ribbon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	public User() {}
	public User(Long id, Long phonenumber, String name, Double balanceamt) {
		super();
		this.id = id;
		this.phonenumber = phonenumber;
		this.name = name;
		this.balanceamt = balanceamt;
	}
	private Long phonenumber;
	private String name;
	private Double balanceamt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalanceamt() {
		return balanceamt;
	}
	public void setBalanceamt(Double balanceamt) {
		this.balanceamt = balanceamt;
	}

}
