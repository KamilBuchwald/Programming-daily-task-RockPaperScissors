package main;

import java.util.Scanner;

public class UserChoice {
	
	public String choice(){
		
		String choic = null;
		
		Scanner sc = new Scanner(System.in);
		
		String Move = sc.nextLine();
		
		if((Move.equals("Rock")) || (Move.equals("rock"))) {
			choic = "Rock";
		}
		else if((Move.equals("Paper")) || (Move.equals("paper"))) {
			choic = "Paper";
		}
		else if((Move.equals("Scissors")) || (Move.equals("scissors"))) {
			choic = "Scissors";
		}else{
			choic ="I don't understand";
		}
		
		
		
		
		
		
		return choic;
		
	}

}
