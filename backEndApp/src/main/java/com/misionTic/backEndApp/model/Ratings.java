package com.misionTic.backEndApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ratings {
	
	@Id
	private int rating_id;
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Users author_id;
	
	@ManyToOne
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
