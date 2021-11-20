package com.misionTic.backEndApp.api;

import java.util.List;

<<<<<<< HEAD
=======
import org.apache.catalina.User;
>>>>>>> parent of 7f174ef (Update Users and Ratings)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misionTic.backEndApp.dao.UsersDAO;
import com.misionTic.backEndApp.model.Users;


@RestController
@RequestMapping("users")
public class UsersAPI {
	
	@Autowired
	private UsersDAO usersDao;
	
<<<<<<< HEAD
	@PostMapping("/saveUser")
	public void saveClient(@RequestBody Users user) {
		usersDao.save(user);
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody Users user) {
		usersDao.save(user);
	}
	
	@GetMapping("/askUser/{email}")
	public Users findUserByEmail(@PathVariable("email") String email) {
		return usersDao.findUserByEmail(email);
	}
	
	@DeleteMapping("/deleteUser/{email}")
	public void deleteUser(@PathVariable("email") String email) {
		usersDao.deleteUserByEmail(email);
	}
	
=======

>>>>>>> parent of 7f174ef (Update Users and Ratings)

}
