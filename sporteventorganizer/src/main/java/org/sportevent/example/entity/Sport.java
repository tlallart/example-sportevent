package org.sportevent.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is the object representation of a sport record from persistence view. 
 *
 */
@Entity
@Table(name = "SPORT")
public class Sport {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@Column(name = "NAME", length=255)
	private String name;
	
	public Sport() {
		super();
	}

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
	
	
	
}
