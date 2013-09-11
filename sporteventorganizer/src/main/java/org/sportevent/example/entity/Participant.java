package org.sportevent.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.sportevent.example.Gender;

@Entity
public class Participant {

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthDate;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private Preferences preferences;
	
}
