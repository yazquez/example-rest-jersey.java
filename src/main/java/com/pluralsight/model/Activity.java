package com.pluralsight.model;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Activity {
	private String id;
	private String description;
	private int duration;
	private User user;
	
	@XmlElement(name="desc")
	public String getDescription() {
		return description;
	}
	public Activity setDescription(String description) {
		this.description = description;
		return this;
	}
	public int getDuration() {
		return duration;
	}
	public Activity setDuration(int duration) {
		this.duration = duration;
		return this;
	}
	public String getId() {
		return id;
	}
	public Activity setId(String id) {
		this.id = id;
		return this;
	}
	public User getUser() {
		return user;
	}
	public Activity setUser(User user) {
		this.user = user;
		return this;
	}
	
	@Override
	public String toString() {
		return String.format("Descripcion: %s, Duracion: %s minutos", this.getDescription(), this.getDuration());
	}
}
