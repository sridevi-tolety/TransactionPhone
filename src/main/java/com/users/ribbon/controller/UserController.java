package com.users.ribbon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.ribbon.config.BankAccountclient;
import com.users.ribbon.models.PhoneTransaction;
import com.users.ribbon.models.User;
import com.users.ribbon.repository.TransactionRepository;
import com.users.ribbon.repository.UserRepository;

@RestController
@RequestMapping("/appuser")
public class UserController {
	@Autowired
	UserRepository urep;
	
	@Autowired
	TransactionRepository trep;
	
	@Autowired
	BankAccountclient bac;
	
	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return urep.findAll();
	}
	
	@PostMapping("/registeruser")
	public User RegisterUser(@RequestBody User user) {
		Double balance = bac.getAcctNumber(user.getPhonenumber());
		user.setBalanceamt(balance);		
		urep.save(user);
		return user;
	}
	
	@GetMapping("/gettransaction")
	public List<PhoneTransaction> getTransactions() {
		return trep.findAll();
	}
	
	@GetMapping("/gettransactions/{count}")
	public List<PhoneTransaction> getTransactionsByCount(@PathVariable int count) {
		return trep.findByCount(count);
	}
	
	@PostMapping("/transferamount")
	public PhoneTransaction saveTransaction(@RequestBody PhoneTransaction ptrans) {
		return trep.save(ptrans);		
	}

}
