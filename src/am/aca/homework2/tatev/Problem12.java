package am.aca.homework2.tatev;

import java.util.Scanner;
import java.util.Locale;

public class Problem12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Input the first number:");
		double num1 = scanner.nextDouble();
		System.out.println("Input the second number:");
		double num2 = scanner.nextDouble();
		System.out.println("Input the operator:");
		char symbol = scanner.next().charAt(0);
		//String symbol = scanner.next();
		
		double result;
		
		if (symbol == '+') {
			result = num1 + num2;
			System.out.println(result);
		} else if (symbol == '-') {
			result = num1 - num2;
			System.out.println(result);
		} else if (symbol == '*') {
			result = num1 * num2;
			System.out.println(result);
		} else if (symbol == '/') {
			if (num2 == 0)
				System.out.println("Can't divide by zero.");
			else {
				result = num1 / num2;
				System.out.println(result);
			}
		}	
	}
}
