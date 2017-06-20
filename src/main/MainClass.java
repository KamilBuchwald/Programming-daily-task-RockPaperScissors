package main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String Result = null;
		String Figure = null;
		String next = null;
		do{
			
		
		System.out.println("\n Select Rock Paper or Scissors");
		UserChoice uc = new UserChoice();
		String UC = uc.choice();
		
		RandomUser rd = new RandomUser();
		int number= rd.compare();
		
		if(number==1){
			Figure="Rock";
		}else if(number==2){
			Figure="Paper"; 
		}else if(number==3){
			Figure="Scissors";
		}
		
		if(number==1){
			 if(UC.equals("Paper")){
				 Result="You win!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else if(UC.equals("Scissors")){
				 Result="You lose!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else if(UC.equals("Rock")){
				 Result="This same!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else{
				 System.out.println("\n I don't understand you press any key to try again!");
				 //Result="I don't understand you";
				 Scanner sc = new Scanner(System.in);
				 next = sc.nextLine();
			 }
		 }

		 else if(number==2){
			if(UC.equals("Scissors")){
				 Result="You win!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else if(UC.equals("Rock")){
				 Result="You lose!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else if(UC.equals("Paper")){
				 Result="This same!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else{
				 System.out.println("\n I don't understand you press any key to try again!");
				// Result="I don't understand you";
				 Scanner sc = new Scanner(System.in);
				 next = sc.nextLine();
			 }
		 }

		 else if(number==3){
			if(UC.equals("Rock")){
				 Result="You win!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else if(UC.equals("Paper")){
				 Result="You lose!";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else if(UC.equals("Scissors")){
				 Result="This same";
				 System.out.println("\n"+Figure +" "+ Result);
			 }else{
				 System.out.println("\n I don't understand you press any key to try again!");
				 //Result="I don't understand you press C to try again!";
				 Scanner sc = new Scanner(System.in);
				 next = sc.nextLine();
				 }
			
		
		 }
		
	
		}while(next!="c" || next !="C");

	}

}
