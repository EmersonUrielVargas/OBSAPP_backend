package com.misionTic.backEndApp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comments {
	
	@Id
	private int comment_id;
	private Date date;
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Users author_id;
	@ManyToOne
	@JoinColumn(name = "project_id")
	private Projects project_id;
	private String message;
	
	
	
	public Comments() {
		super();
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
