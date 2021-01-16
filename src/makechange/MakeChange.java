package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// convert the price from a decimal number to an integer,
		// with each value representing one cent
		System.out.print("Enter price of item: $");
		double price = input.nextDouble();
		int priceCents = (int) (price * 100);

		// convert the amount paid from a decimal number to an integer,
		// with each value representing one cent
		System.out.print("Enter amount tendered: $");
		double paid = input.nextDouble();
		int paidCents = (int) (paid * 100);

		// calculates total change and converts back to decimal form for printing
		int changeCents = paidCents - priceCents;
		double change = (changeCents);
		change = change / 100;
		System.out.println();
		

		int twentys = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		if (changeCents == 0) {
			System.out.println("You have paid in exact change.");
		}
		if (changeCents < 0) {
			System.out.println("The amount tendered is not enough to purchase this item.");
		} 
		else if (changeCents > 0) {
			// Uses nested 'if' statements to calculate change distribution, and prints a
			//line only if a certain denomination is used, stating the correct plurality 
			
			System.out.println("The customer's change is: $" + change);
			System.out.println();
			System.out.println("Dispense as: ");
			
			if (changeCents - 2000 >= 0) {
				twentys = changeCents / 2000;
				changeCents = changeCents - (twentys * 2000);
				if (twentys > 1) {
					System.out.println(twentys + " twenty dollar bills");
				} else {
					System.out.println(twentys + " twenty dollar bill");

				}
			}

			if (changeCents - 1000 >= 0) {
				tens = changeCents / 1000;
				changeCents = changeCents - (tens * 1000);
					System.out.println(tens + " ten dollar bill");
// ten does not need an additional 'if' statement, because any multiple of 10 will be dispensed as a 20
				}
			

			if (changeCents - 500 >= 0) {
				fives = changeCents / 500;
				changeCents = changeCents - (fives * 500);
				if (fives > 1) {
					System.out.println(fives + " five dollar bills");
				} else {
					System.out.println(fives + " five dollar bill");

				}

			}

			if (changeCents - 100 >= 0) {
				ones = changeCents / 100;
				changeCents = changeCents - (ones * 100);
				if (ones > 1) {
					System.out.println(ones + " one dollar bills");
				} else {
					System.out.println(ones + " one dollar bill");

				}
			}

			if (changeCents - 25 >= 0) {
				quarters = changeCents / 25;
				changeCents = changeCents - (quarters * 25);
				if (quarters > 1) {
					System.out.println(quarters + " quarters");
				} else {
					System.out.println(quarters + " quarter");

				}
			}

			if (changeCents - 10 >= 0) {
				dimes = changeCents / 10;
				changeCents = changeCents - (dimes * 10);
				if (dimes > 1) {
					System.out.println(dimes + " dimes");
				} else {
					System.out.println(dimes + " dime");

				}
			}

			if (changeCents - 5 >= 0) {
				nickels = changeCents / 5;
				changeCents = changeCents - (nickels * 5);
				if (nickels > 1) {
					System.out.println(nickels + " nickels");
				} else {
					System.out.println(nickels + " nickel");

				}
			}

			if (changeCents - 1 >= 0) {
				pennies = changeCents;
				changeCents = changeCents - (pennies);
				if (pennies > 1) {
					System.out.println(pennies + " pennies");
				} else {
					System.out.println(pennies + " penny");

				}
			}

		}
	}
}
