package com.users.ribbon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.ribbon.models.User;

public interface UserRepository extends JpaRepository<User , Long>{

}
