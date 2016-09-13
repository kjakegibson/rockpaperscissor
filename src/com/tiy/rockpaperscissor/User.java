package com.tiy.rockpaperscissor;

import java.util.Scanner;

import com.tiy.arena.Validation;

public class User extends Player{
	
	protected String userName = null;
	protected static boolean stillPlaying = true;
	static Scanner sc = new Scanner (System.in);
//	public static boolean stillPlaying = true;
	
	
	
	
	
	public static boolean playGame()
	{
		System.out.println("This is Arena based Rock, Paper, Scissors, Lizard, Spock! ARE YOU MAN SLASH WOMAN ENOUGH?!?!?!");
		System.out.println("Enter your name, mere mortal!");
		String userName = sc.nextLine();
		
		
		System.out.println("CHOOSE YOUR OPPONENT\n"
				+ "\t 1. LARRY\n"
				+ "\t 2. MOE\n"
				+ "\t 3. CURLY");
		String oppChoice = sc.nextLine();
		Validation.selectionIsValid(oppChoice);
		
		
		
		return stillPlaying;
		
	}
	
	
public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


public User(int rock, int paper, int scissor, int lizard, int spock, String userName, Scanner sc) {
	super(rock, paper, scissor, lizard, spock);
	this.userName = userName;
}


public User() {
	
}


@Override
public void shoot() {
	// TODO Auto-generated method stub
	
}

}
