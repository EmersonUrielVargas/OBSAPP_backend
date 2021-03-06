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
public class Ratings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rating_id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "author_id")
	private Users author_id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "project_id")
	private Projects project_id;
	
	private int score;
	
	public Ratings() {
		super();
	}
	
	public int getRating_id() {
		return rating_id;
	}
	
	public Users getAuthor_id() {
		return author_id;
	}
	
	
}
