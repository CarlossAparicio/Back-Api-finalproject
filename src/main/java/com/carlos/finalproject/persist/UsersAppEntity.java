package com.carlos.finalproject.persist;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the users_app database table.
 * 
 */
@Entity
@Table(name="users_app")
@NamedQuery(name="UsersAppEntity.findAll", query="SELECT u FROM UsersAppEntity u")
public class UsersAppEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="last_name")
	private String lastName;

	private String mail;

	private String name;

	//bi-directional many-to-one association to UsersTypeEntity
	@ManyToOne
	@JoinColumn(name="workstation")
	private UsersTypeEntity usersType;

	public UsersAppEntity() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UsersTypeEntity getUsersType() {
		return this.usersType;
	}

	public void setUsersType(UsersTypeEntity usersType) {
		this.usersType = usersType;
	}

}