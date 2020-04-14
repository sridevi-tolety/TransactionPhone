package com.users.ribbon.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.users.ribbon.models.BankAccount;



@FeignClient(name="banking-service", url ="http://localhost:8080")
public interface BankAccountclient {
	
	@GetMapping("/banking/checkExistance/{phonenumber}")
	public Double getAcctNumber(@PathVariable Long phonenumber);
}
