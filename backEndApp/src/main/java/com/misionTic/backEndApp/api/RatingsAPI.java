package com.misionTic.backEndApp.api;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> parent of 7f174ef (Update Users and Ratings)
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ratings")
public class RatingsAPI {
<<<<<<< HEAD
	
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
	
	@GetMapping("/listar")
	public List<Ratings> listRatings(){
		return ratingsDao.findAll();
	}
=======
>>>>>>> parent of 7f174ef (Update Users and Ratings)

}
