package com.misionTic.backEndApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misionTic.backEndApp.model.Projects;

public interface ProjectsDAO extends JpaRepository< Projects,Integer>{

}
