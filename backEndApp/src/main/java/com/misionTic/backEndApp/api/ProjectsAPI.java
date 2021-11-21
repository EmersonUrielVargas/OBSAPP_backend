package com.misionTic.backEndApp.api;

import java.util.List;
import java.util.Optional;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.misionTic.backEndApp.dao.ProjectsDAO;
import com.misionTic.backEndApp.model.Projects;
import com.misionTic.backEndApp.model.Users;

@RestController
@RequestMapping("proyects")
public class ProjectsAPI {
	
	@Autowired
	private ProjectsDAO proyectsDAO;
	
	
	@GetMapping("/askProyect/{id}")
	public Projects findProyectById(@PathVariable("id") int id) {
		return proyectsDAO.getById(id);
	}
	
	@GetMapping("/proyects/ods/{ods_id}")
	public List<Projects> getProyectsByODS(@PathVariable("ods_id") int id){
		return proyectsDAO.findProyectsByODS(id);
	}
	
	@GetMapping("/proyects/user/{developer_id}")
	public List<Projects> getProyectsByUser(@PathVariable("developer_id") int id){
		return proyectsDAO.findProyectsByUser(id);
	}
	
	@GetMapping("/saveProject")
	public Projects saveProject(@RequestBody Projects project) {
		return proyectsDAO.save(project);
		
	}
	
	@GetMapping("/updateProject")
	public Projects updateProject(@RequestBody Projects project) {
		return proyectsDAO.save(project);
	}


}
