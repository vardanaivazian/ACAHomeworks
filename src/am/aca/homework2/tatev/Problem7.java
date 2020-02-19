package am.aca.homework2.tatev;/*
 * Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, 
 * "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
 */

import java.util.Scanner;
import java.util.Locale;

public class Problem7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		//Scanner scanner = new Scanner(System.in);
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		
		if (num1 < num2 && num2 < num3)
			System.out.println("increasing");
		else if (num1 > num2 && num2 > num3)
			System.out.println("decreasing");
		else
			System.out.println("Neither");
	}

}
