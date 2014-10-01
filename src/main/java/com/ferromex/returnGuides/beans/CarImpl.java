package com.ferromex.returnGuides.beans;

import java.util.Date;

public class CarImpl implements Car {
	private String initial;
	private int number;
	private Station station;
	private Stcc content;
	private Date located;
	
	public CarImpl() {
		initial = "FXE";
		number = 0;
		station = null;
		content = null;
		located = null;
	}
	
	public CarImpl(String initial, int number) {
		this.initial = initial;
		this.number = number;
		station = null;
		content = null;
		located = null;
	}
	
	public void setInitial(String value) {
		initial = value;
	}
	
	public String getInitial() {
		return initial;
	}
	
	public void setNumber(int value) {
		number = value;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setStation(Station value) {
		station = value;
	}
	
	public Station getStation() {
		return station;
	}
	
	public void setStcc(Stcc value) {
		content = value;
	}
	
	public Stcc getStcc() {
		return content;
	}
	
	public void setlocated(Date value) {
		located = value;
	}
	
	public Date getLocated() {
		return located;
	}
	
	@Override
	public String toString() {
		return initial + "-" + number;
	}
}
