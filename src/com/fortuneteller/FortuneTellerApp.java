package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine ();
		
		System.out.println("What is your age?");
		int personAge = input.nextInt();
		input.nextLine();
		
		System.out.println("What numbered month were you born?");
		int personMonth = input.nextInt();
		input.nextLine();

		System.out.println("What is your favorite ROYGBIV color? If you do not know what ROYGBIV is, ask for help.");
		String personColor = input.nextLine();
		String help = null;
		personColor = help; System.out.println ("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
		
		//need conditional statement for help to be if "help" then supply
		
		System.out.println("How many siblings do you currently have?");
		int personSibling = input.nextInt();
	
		int yearRetire;
		if (personAge < 42) {
            yearRetire =  20 ; 
             } else {
         yearRetire = 30 ;
             }
		
		String vacationLocation;
		if (personSibling == 2) {
			vacationLocation = "Ireland" ;
			
		} else {
			vacationLocation = "Scotland" ;
		}	
		
		int bankBalance;
		if (personMonth <= 5) {
			bankBalance = 300;
		} else {
			bankBalance = 10000 ;
		}
		
		
		
		System.out.println(firstName +" " + lastName +" "+"will retire in "+ yearRetire +" years, with " +bankBalance +" dollars in the bank, a vacation home in " + vacationLocation +" "+ "and travel by " + personColor);
}
	}

//String modeTrans;
//if (personColor == "red") {
	//modeTrans = "car";

//if (color.help () == true {
//System.out.println("red, orange, yellow");

//String color;
//if (color = "help") {
//return color [] System.out.println("red");

//void colorOut ("What is your favorite color? If you need help type help") {
//if (color.help ()) {
	//System.out.println("help");

			//personColor = (personColor = "red");
		  //  modeTrans = "car";
		
		//personColor = (personColor = "orange");
			//modeTrans = "vespa";
		
//personColor = (personColor = "yellow"); 
//modeTrans = "skateboard";

//personColor = (personColor = "green"); 
//modeTrans = "foot";

//personColor = (personColor = "blue"); 
//modeTrans = "truck";

//personColor = (personColor = "indigo"); 
//modeTrans = "tractor";

//personColor = (personColor = "violet"); 
//modeTrans = "motorcycle";