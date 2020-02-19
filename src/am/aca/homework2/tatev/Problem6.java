package am.aca.homework2.tatev;/*
 * Write a Java program to convert seconds to hour, minute and seconds.
 */

import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("Input seconds:");
		System.out.println(num);
		
		int day = num%(24*3600);
		int hour = day/3600;
		int min = day%3600;
		//System.out.println(min);
		int min1 = min/60;
		//System.out.println(min1);
		int sec = min1%60;
		//System.out.println(sec);
		System.out.println(hour + ":" + min1 + ":" + sec);
	}
}