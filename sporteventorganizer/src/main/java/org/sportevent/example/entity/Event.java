package org.sportevent.example.entity;

import java.util.Date;
import java.util.Set;

public class Event {
	
	private int id;
	
	private Date startDate;
	
	private Date endDate;
	
	private String name;
	
	private String city;
	
	private Set<Competition> competitions;

}
