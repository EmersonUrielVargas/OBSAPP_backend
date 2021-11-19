package com.misionTic.backEndApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misionTic.backEndApp.dao.RatingsDAO;
import com.misionTic.backEndApp.model.Ratings;

@RestController
@RequestMapping("ratings")
public class RatingsAPI {
	
	@Autowired
	private RatingsDAO ratingsDao;
	
	@PostMapping("/saveRating")
	public void saveRating(@RequestBody Ratings rating) {
		ratingsDao.save(rating);
	}
	
	@PutMapping("/updateRating")
	public void updateUser(@RequestBody Ratings rating) {
		ratingsDao.save(rating);
	}

}
