package com.users.ribbon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.users.ribbon.models.PhoneTransaction;

public interface TransactionRepository extends JpaRepository<PhoneTransaction , Long>{

	@Query(value = "select top ?1 * from phone_transaction" , nativeQuery=true)
	List<PhoneTransaction> findByCount(int count);

}
