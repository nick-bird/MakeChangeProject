package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Price of item: ");
		double price = input.nextDouble();
		int priceCents = (int) (price * 100);
		// convert the price from a decimal number to a whole number,
//with each value representing one cent 
		System.out.println("Amount tendered: ");
		double paid = input.nextDouble();
		int paidCents = (int) (paid * 100);
		// convert the amount paid from a decimal number to a whole number,
		//with each value representing one cent 
		
		int changeCents = paidCents - priceCents;
		System.out.println(changeCents);
		
		double change = (changeCents);
		change = change /100;
		System.out.println(change);
		//converts back to decimal, and divides by 100 to 
		// represent standard monetary notation 
		
	
	
		int twentys = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 1;
		
		if (changeCents - 2000 > 0) {
			twentys = changeCents / 2000; 
			changeCents = changeCents - (twentys * 2000);
			System.out.println(changeCents);
		System.out.println("$20 x " + twentys);
		
			if (changeCents - 1000 > 0) {
			tens = changeCents / 1000;
			changeCents = changeCents - (tens * 1000);
			System.out.println(changeCents);
		System.out.println("$10 x " + tens);
			}
		
			if (changeCents - 500 > 0) {
				fives = changeCents / 500;
				changeCents = changeCents - (fives * 500);
				System.out.println(changeCents);
			System.out.println("$5 x " + fives);
		
	}
		if (changeCents - 100 > 0) {
			ones = changeCents / 100;
			changeCents = changeCents - (ones * 100);
			System.out.println(changeCents);
			System.out.println("$1 x " + ones);
			
		}
		if (changeCents - 25 > 0) {
			quarters = changeCents / 25;
			changeCents = changeCents - (ones * 25);
			System.out.println("$0.25 x " + quarters);
			
			
		}
		if (changeCents - 10 > 0) {
			dimes = changeCents / 10;
			changeCents = changeCents - (dimes * 10);
			System.out.println(changeCents);
			System.out.println("$0.10 x " + dimes);
			
			
		}
		if (changeCents - 5 > 0) {
			nickels = changeCents / 5;
			changeCents = changeCents - (nickels * 5);
			System.out.println(changeCents);
			System.out.println("$0.5 x " + nickels);
			
			
		}
		if (changeCents - 1 >= 0) {
			pennies = changeCents;
			changeCents = changeCents - (pennies);
			System.out.println(changeCents);
			System.out.println("$0.1 x " + pennies);
			
		}
		System.out.println(changeCents);
		
}
}
}
	




	


