package org.sportevent.example;

public enum Gender {

	MALE("man"), FEMALE("woman");

	private final String genderName;

	private Gender(String genderName) {
		this.genderName = genderName;
	}

	public String getGenderName() {
		return genderName;
	}
}
