package com.demo.first.firstdemo.bo;

public class StudentBO {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private long no;
	
	public void setEmail(){
		this.email=email;
	}
	public String getEmail(String email) {
		return email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
