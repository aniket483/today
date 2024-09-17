package com.restaurant.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ContactForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long contactFormId;
	private String name;
	private String email;
	private String subject;
	private String message;
	public long getContactFormId() {
		return contactFormId;
	}
	public void setContactFormId(long contactFormId) {
		this.contactFormId = contactFormId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
