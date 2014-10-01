package com.ferromex.returnGuides.beans;

public class StationImpl implements Station {
	private String id;
	private String city;
	private String state;

	public StationImpl() {
		id = "";
		city = "";
		state = "";
	}
	
	public StationImpl(String id) {
		this.id = id;
		city = "";
		state = "";		
	}
	
	public StationImpl(String id, String city, String state) {
		this.id = id;
		this.city = city;
		this.state = state;	
	}
	
	public String getId() {
		return id;
	}

	public void setId(String value) {
		id = value;		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String value) {
		city = value;
	}

	public String getState() {
		return state;
	}

	public void setState(String value) {
		state = value;
	}
	
	@Override
	public String toString() {
		return "[" + id + "] " + city + ", " + state;
	}
}
