package com.misionTic.backEndApp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misionTic.backEndApp.dao.CommentsDAO;
import com.misionTic.backEndApp.model.Comments;
import com.misionTic.backEndApp.model.Users;

@RestController
@RequestMapping("comments")
public class CommentsAPI {
	
	@Autowired
	private CommentsDAO comDao;
	
	@GetMapping("/comments/{project_id}")
	public List<Comments> listComentsByProyect(@PathVariable("project_id") int id){
		return  comDao.findCommentsByProyect(id);
	}
	
	@PostMapping("/saveComment")
	public void saveClient(@RequestBody Comments comment) {
		comDao.save(comment);
	}
	
	@PutMapping("/updateComment")
	public void updateUser(@RequestBody Comments comment) {
		comDao.save(comment);
	}
	
	

}
