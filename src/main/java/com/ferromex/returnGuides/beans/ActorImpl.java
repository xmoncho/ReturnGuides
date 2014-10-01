package com.ferromex.returnGuides.beans;

public class ActorImpl implements Actor {
	private String name;
	private String address;
	private String city;
	private String state;
	private String tel;
	
	public ActorImpl() {
		name = "";
		address = "";
		city = "";
		state = "";
		tel = "";
	}
	
	public ActorImpl(String name) {
		this.name = name;
		address = "";
		city = "";
		state = "";
		tel = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String value) {
		address = value;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String value) {
		tel = value;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
