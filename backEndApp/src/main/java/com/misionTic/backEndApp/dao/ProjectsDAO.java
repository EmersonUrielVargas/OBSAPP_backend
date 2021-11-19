package com.misionTic.backEndApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.misionTic.backEndApp.model.Projects;

public interface ProjectsDAO extends JpaRepository< Projects,Integer>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM Projects WHERE ods_id = ?1")
	List<Projects> findProyectsByODS(Integer ods_id);
	
	@Query(nativeQuery = true, value = "SELECT * FROM Projects WHERE developer_id = ?1")
	List<Projects> findProyectsByUser(Integer user_id);

}
