package am.aca.homework2.tatev;/*
 * A school has following rules for grading system:
 * a. Below 25 - F
 * b. 25 to 45 - E
 * c. 45 to 50 - D
 * d. 50 to 60 - C
 * e. 60 to 80 - B
 * f. Above 80 - A
 * Ask user to enter a mark and print the corresponding grade.
 */

import java.util.Scanner;
public class Problem8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the mark:");
		
		int mark = scanner.nextInt();
		
		if (mark <= 25) {
			System.out.println("Below 25 - F");
		} else if (mark >= 25 && mark < 45)
			System.out.println("25 to 45 - E");
		else if (mark >= 45 && mark < 50)
			System.out.println("45 to 50 - D");
		else if (mark >= 50 && mark < 60)
			System.out.println("50 to 60 - C");
		else if (mark >= 60 && mark < 80)
			System.out.println("60 to 80 - B");
		else if (mark >= 80)
			System.out.println("Above 80 - A");
	}
}
