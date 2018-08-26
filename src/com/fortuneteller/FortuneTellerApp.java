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
		boolean personAge = input.nextInt();
		input.nextLine();
		
		System.out.println("What numbered month were you born?");
		int personMonth = input.nextInt();
		
		
		System.out.println("What is your favorite ROYGBIV color?");
		String personColor = input.nextLine();
		input.nextLine();
		
		// firgure out how to put in Help to get a list of colors
		
		System.out.println("How many siblings do you currently have?");
		String personSibling = input.nextLine();
		
		if (personAge > 32)
		// figure out conditional for retirement based on age
		
		// figure out vacation home based on number of sibling 
		
		// figure out transporation based on color
		
		//figure out bank balance based on month born
		
		
	}

}
