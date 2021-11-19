package com.misionTic.backEndApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.misionTic.backEndApp.model.Users;

public interface UsersDAO extends JpaRepository<Users, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM users WHERE email = 1?")
	Users findUserByEmail(String email);
	
	@Query(nativeQuery = true, value = "DELETE * FROM users WHERE email = 1?")
	void deleteUserByEmail(String email);
}
