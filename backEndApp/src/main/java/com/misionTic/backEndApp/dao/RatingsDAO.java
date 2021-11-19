package com.misionTic.backEndApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misionTic.backEndApp.model.Ratings;

public interface RatingsDAO extends JpaRepository<Ratings,Integer > {
	
}
