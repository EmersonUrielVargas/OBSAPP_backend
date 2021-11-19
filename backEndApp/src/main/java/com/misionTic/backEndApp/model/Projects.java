package com.misionTic.backEndApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Projects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;
	private String name;
	private String description;
	private int score;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "developer_id")
	private Users developer_id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ods_id")
	private ODS ods_id;
	
	
	public Projects() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getProject_id() {
		return project_id;
	}


	public Users getDeveloper_id() {
		return developer_id;
	}
	
	
	
	
	
	
	
}
