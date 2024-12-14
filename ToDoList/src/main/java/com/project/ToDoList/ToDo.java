package com.project.ToDoList;

import java.time.LocalDate;

public class ToDo {
	
	public ToDo(int id, String name,String description ,LocalDate targetdate, boolean done) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.targetdate = targetdate;
		this.done = done;
	}
	
	
	private int id;
	private String name;
	private LocalDate targetdate;
	private String description;
	private boolean done;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getTargetdate() {
		return targetdate;
	}
	
	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isDone() {
		return done;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}
	
	
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", name=" + name + ", targetdate=" + targetdate + ", description=" + description
				+ ", done=" + done + "]";
	}
	

}
