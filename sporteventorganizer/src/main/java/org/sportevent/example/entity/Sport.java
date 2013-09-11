package org.sportevent.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPORT")
public class Sport {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@Column(name = "NAME", length=255)
	private String name;
	
}
