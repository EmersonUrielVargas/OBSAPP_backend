package com.misionTic.backEndApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.misionTic.backEndApp.model.Comments;



public interface CommentsDAO extends JpaRepository<Comments, Integer>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM Comments WHERE project_id = 1?")
	List<Comments> findCommentsByProyect(Integer proyect_id);


	@Query(nativeQuery = true, value = "SELECT * FROM Comments WHERE project_id = 1?")
	List<Comments> findCommeyProyect(Integer proyect_id);

}
