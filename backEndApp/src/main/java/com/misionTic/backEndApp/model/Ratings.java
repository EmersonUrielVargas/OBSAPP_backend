package com.misionTic.backEndApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ratings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Projects getProject_id() {
		return project_id;
	}

	public void setProject_id(Projects project_id) {
		this.project_id = project_id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setRating_id(int rating_id) {
		this.rating_id = rating_id;
	}

	public void setAuthor_id(Users author_id) {
		this.author_id = author_id;
	}
	
	
	
	
	
	
}
