package com.ferromex.returnGuides.beans;

import java.util.Date;

public class ReleasedCar extends CarImpl {
	private int folio;
	private int id;
	private Date released;
	private Actor agent;
	private boolean fromSICOFXE;
	private String zvp;
	
	public ReleasedCar() {
		super();
		folio = 0;
		id = 0;
		released = null;
		agent = null;
		fromSICOFXE = false;
		zvp = "";
	}
	
	public ReleasedCar(String initial,int number) {
		super(initial, number);
		folio = 0;
		id = 0;
		released = null;
		agent = null;
		fromSICOFXE = false;
		zvp = "";
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int value) {
		folio = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int value) {
		id = value;
	}

	public Date getReleased() {
		return released;
	}

	public void setReleased(Date value) {
		released = value;
	}

	public Actor getAgent() {
		return agent;
	}

	public void setAgent(Actor value) {
		agent = value;
	}

	public boolean isFromSICOFXE() {
		return fromSICOFXE;
	}

	public void setFromSICOFXE(boolean value) {
		fromSICOFXE = value;
	}

	public String getZvp() {
		return zvp;
	}

	public void setZvp(String value) {
		zvp = value;
	}
}
