package com.tiy.rockpaperscissor;

public class Opponent extends Player{
	
	protected String name = "Larry";
	
	

	public Opponent(int rock, int paper, int scissor, int lizard, int spock, String name) {
		super(rock, paper, scissor, lizard, spock);
		this.name = name;
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Opponent() {

	}



	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		
	}
	

}
