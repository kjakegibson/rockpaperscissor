package com.tiy.rockpaperscissor;

public abstract class Player {
	
	protected String setName = null;
	protected int shoot = 0;
	
	
	public Player(String setName, int shoot) {
		this.setName = setName;
		this.shoot = shoot;
			
	}
	
	public Player() {
	}
	
	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public int getShoot() {
		return shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	
	
	
	
}

