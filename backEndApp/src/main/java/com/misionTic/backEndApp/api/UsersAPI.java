package com.misionTic.backEndApp.api;

import java.util.List;

import org.apache.catalina.User;
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
	


}
