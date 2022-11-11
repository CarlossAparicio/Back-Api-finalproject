package com.carlos.finalproject.dto;

import com.carlos.finalproject.persist.UsersTypeEntity;

public class UserDTO {
	
	private long id;

	private String lastName;

	private String mail;

	private String name;

	private UsersTypeEntity usersType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UsersTypeEntity getUsersType() {
		return usersType;
	}

	public void setUsersType(UsersTypeEntity usersType) {
		this.usersType = usersType;
	}
}
