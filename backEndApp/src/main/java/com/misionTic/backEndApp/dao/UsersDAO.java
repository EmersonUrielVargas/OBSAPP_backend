package com.misionTic.backEndApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misionTic.backEndApp.model.Users;

public interface UsersDAO extends JpaRepository<Users, Integer> {
	

}
