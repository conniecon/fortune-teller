import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		// your age determines your retirement age
		System.out.println("What is your age?");
		int userAge = input.nextInt();
		
		if(userAge % 2 == 0) {
			System.out.println("You will retire in 15 years");
		} else {
			System.out.println("You will retire in 20 years");
		}
		
		// your birth month determines your bank balance
		System.out.println("What is your birth month number");
		int birthMonth = input.nextInt();
		
		if (birthMonth <= 4) {
			System.out.println("Your bank balance is $300,000.50");
		} else if((birthMonth >= 5) && (birthMonth <= 8)) {
			System.out.println("Your bank balance is $600,000.50");
		} else if ((birthMonth >= 9) && (birthMonth <= 12)) {
			System.out.println("Your bank balance is $900,000.50");
		} else {
			System.out.println("Your bank balance is $0");
		}
		
		// your favorite ROYGBIV color determines transportation
		System.out.println("What is your favorite ROYGBIV color?");
		String faveColor = input.nextLine();
		
		
//		System.out.println("Don't know the ROYGBIV colors? Enter help:");
//		String helpColor = input.nextLine();
//		
//		if (helpColor.equals("help")) {
//			System.out.println("R is red, O is orange, Y is yellow, G is green, B is blue, I is indigo, V is violet");
//		} else {
//			System.out.println("press enter");
//		}
		
		if (faveColor.equals("red")) {
			System.out.println("Your mode of transportation is a Corvette");
		} else if(faveColor.equals("orange")) {
			System.out.println("Your mode of transportation is a Bear");
		} else if(faveColor.equals("yellow")) {
			System.out.println("Your mode of transportation is a Trans Am");
		} else if(faveColor.equals("green")) {
			System.out.println("Your mode of transportation is a Honda");
		} else if(faveColor.equals("blue")) {
			System.out.println("Your mode of transportation is a Mini Cooper");
		} else if(faveColor.equals("indigo")) {
			System.out.println("Your mode of transportation is a Skateboard");
		} else if(faveColor.equals("violet")) {
			System.out.println("Your mode of transportation is a Unicorn");
		
		}
		
		// your number of siblings determines vacation home
		System.out.println("How many siblings do you have?");
		int  numOfSibling = input.nextInt();
		
		if (numOfSibling == 0) {
			System.out.println("Your vacation home is in The Bahamas");
		} else if (numOfSibling == 1) {
			System.out.println("Your vacation home is in Myrtle Beach");
		} else if (numOfSibling == 2) {
			System.out.println("Your vacation home is in Cape Cod");
		} else if (numOfSibling == 3) {
			System.out.println("Your vacation home is in The Outer Banks");
		} else if (numOfSibling > 3) {
			System.out.println("Your vacation home is in Rehobeth Beach, Delaware");
		} else if (numOfSibling < 0) {
			System.out.println("Your vacation home is in Detriot, Michigan");
		}
		
		System.out.println(firstName + lastName + "will retire in " + userAge + " with " 
		+ birthMonth + " in the bank, a vacation home in " + numOfSibling + 
		", and travel by " + faveColor + "." );
		
		input.close();
	}

}
