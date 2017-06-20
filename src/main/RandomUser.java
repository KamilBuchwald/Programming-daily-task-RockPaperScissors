package main;

import java.util.Random; 

public class RandomUser {
	

	 public int compare(){
		
		
		 Random rand = new Random(); 
		 int number = rand.nextInt(3) + 1; 
		
		 return number;
	 }
	 
}

