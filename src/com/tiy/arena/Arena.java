package com.tiy.arena;

import com.tiy.rockpaperscissor.User;

public class Arena {
	
	 public static boolean stillPlaying = true;
	 
	
	
	public static void main(String[] args) {
		
		 while (stillPlaying) {
			 
			 User.playGame();
		 }
	}

	public static String getResult()
		 {
			 
		 
		
		 String[ ][ ] answers = new String[5][5];
	       answers[0][0] = "You threw Rock, your opponent threw Rock. You Tie.";
	       answers[0][1] = "You threw Rock, your opponent threw Paper. You Lose.";
	       answers[0][2] = "You threw Rock, your opponent threw Scissors. You Win.";
	       answers[0][3] = "You threw Rock, your opponent threw Lizard. You Win.";
	       answers[0][4] = "You threw Rock, your opponent threw Spock. You Lose.";
	       answers[1][0] = "You threw Paper, your opponent threw Rock. You Win.";
	       answers[1][1] = "You threw Paper, your opponent threw Paper. You Tie.";
	       answers[1][2] = "You threw Paper, your opponent threw Scissors. You Lose.";
	       answers[1][3] = "You threw Paper, your opponent threw Lizard. You Lose.";
	       answers[1][4] = "You threw Paper, your opponent threw Spock. You Win.";
	       answers[2][0] = "You threw Scissors, your opponent threw Rock. You Lose.";
	       answers[2][1] = "You threw Scissors, your opponent threw Paper. You Win.";
	       answers[2][2] = "You threw Scissors, your opponent threw Scissors. You Tie.";
	       answers[2][3] = "You threw Scissors, your opponent threw Lizard. You Win.";
	       answers[2][4] = "You threw Scissors, your opponent threw Spock. You Lose.";
	       answers[3][0] = "You threw Lizard, your opponent threw Rock. You Lose.";
	       answers[3][1] = "You threw Lizard, your opponent threw Paper. You Win.";
	       answers[3][2] = "You threw Lizard, your opponent threw Scissors. You Lose.";
	       answers[3][3] = "You threw Lizard, your opponent threw Lizard. You Tie.";
	       answers[3][4] = "You threw Lizard, your opponent threw Spock. You Win.";
	       answers[4][0] = "You threw Spock, your opponent threw Rock. You Win.";
	       answers[4][1] = "You threw Spock, your opponent threw Paper. You Lose.";
	       answers[4][2] = "You threw Spock, your opponent threw Scissors. You Win.";
	       answers[4][3] = "You threw Spock, your opponent threw Lizard. You Lose.";
	       answers[4][4] = "You threw Spock, your opponent threw Spock. You Tie.";
		
	       int userThrow = 0 + (int)(Math.random() * ((4 - 0) + 1));
	       int oppThrow = 0 + (int)(Math.random() * ((4 - 0) + 1));
	       
	       String result = (answers[userThrow][oppThrow]);
	       
	       System.out.println(answers[userThrow][oppThrow]);
	       
	       return result;
		
		 
	}

}
