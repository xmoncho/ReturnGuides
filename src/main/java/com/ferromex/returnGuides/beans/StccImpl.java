package com.ferromex.returnGuides.beans;

public class StccImpl implements Stcc {
	private int id;
	private String name;
	
	public StccImpl() {
		id = 0;
		name = "";
	}
	
	public StccImpl(String name) {
		id = 0;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int value) {
		id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
