package com.users.ribbon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue
	private Long id;
	public BankAccount(Long id, Long phonenumber, Long accountnumber, String name, Double balanceamount) {
		super();
		this.id = id;
		this.phonenumber = phonenumber;
		this.accountnumber = accountnumber;
		this.name = name;
		this.balanceamount = balanceamount;
	}
	public BankAccount() {}
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
	public Long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalanceamount() {
		return balanceamount;
	}
	public void setBalanceamount(Double balanceamount) {
		this.balanceamount = balanceamount;
	}
	private Long phonenumber;
	private Long accountnumber;
	private String name;
	private Double balanceamount;
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", phonenumber=" + phonenumber + ", accountnumber=" + accountnumber + ", name="
				+ name + ", balanceamount=" + balanceamount + "]";
	}	
	
}
