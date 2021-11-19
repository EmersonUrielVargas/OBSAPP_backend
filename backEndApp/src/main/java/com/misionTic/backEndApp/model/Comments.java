package com.misionTic.backEndApp.model;

import java.util.Date;

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
public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int comment_id;
	private Date date;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "author_id")
	private Users author_id;
	@ManyToOne(cascade = CascadeType.PERSIST)
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
