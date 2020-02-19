package am.aca.homework2.tatev;/*
 * Take input of age of 3 people by user and determine oldest and youngest among them.
 */
import java.util.Scanner;
public class Problem10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert the age of the first user:");
		int age1 = scanner.nextInt();
		
		System.out.println("Insert the age of the second user:");
		int age2 = scanner.nextInt();
		
		System.out.println("Insert the age of the third user:");
		int age3 = scanner.nextInt();
		
		if(age1 > age2 && age1 > age3) {
			System.out.println("First user is the oldest one.");
			if(age2 > age3) {
				System.out.println("Third user is the youngest one.");
			} 
			else if (age2 == age3) {
				System.out.println("Third and second are at the same age.");		
			}
			else {
				System.out.println("Second user is the youngest one.");
			}
				
		} else if(age2 > age1 && age2 > age3) {
			System.out.println("Second user is the oldest one.");
			if(age1 > age3) {
				System.out.println("Third user is the youngest one.");
			} 
			else if (age1 == age3) {
				System.out.println("First and third are at the same age.");
			} 
			else {
				System.out.println("First user is the youngest one.");
			}
			
		} else if(age3 > age1 && age3 > age2) {
			System.out.println("Third user is the oldest one.");
			if(age1 > age2) {
				System.out.println("Second user is the youngest one.");
			} 
			else if (age1 == age2) {
				System.out.println("First and second are at the same age.");
			}
			else {
				System.out.println("First user is the youngest one.");
			}
				
		} else if (age1 == age2 && age1 > age3) {
				System.out.println("First and second are equally old.");
				System.out.println("Third is the youngest user.");

		} else if (age2 == age3 && age2 > age1) {
				System.out.println("Third and second are equally old.");
				System.out.println("First is the youngest user.");
			} 
		 else if (age1 == age3 && age1 > age2) {
				System.out.println("First and second are equally old.");
				System.out.println("Second is the youngest user.");
			}
		 else
			 	System.out.println("All are at the same age.");
	}
}
