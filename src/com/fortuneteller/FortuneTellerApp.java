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
		
		//if (personColor = "help")
		//	System.out.println ("Red, Orange, Yellow, Green, Blue, Indigo, Violet")
		
		// firgure out how to put in Help to get a list of colors
		
		System.out.println("How many siblings do you currently have?");
		String personSibling = input.nextLine();
	
		
	//	int personAge ( );
       if (personAge <= 42); {
           System.out.println(" 20 years"); {
           }
            }
       if (personAge >= 42);
        System.out.println(" 30 years");
		
        System.out.println(firstName +" " + lastName +" "+"will retire in "+ personAge +" "+ "with " +personMonth +" "+ "in the bank, a vacation home in " + personSibling +" "+ "and travel by " + personColor);	
        
	}
}
