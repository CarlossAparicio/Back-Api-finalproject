package com.carlos.finalproject.persist;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the users_types database table.
 * 
 */
@Entity
@Table(name="users_types")
@NamedQuery(name="UsersTypeEntity.findAll", query="SELECT u FROM UsersTypeEntity u")
public class UsersTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;

	public UsersTypeEntity() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}