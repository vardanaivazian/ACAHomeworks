package am.aca.homework2.tatev;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Assign a value to 'doesSignificantWork'.");
		boolean doesSignificantWork = scanner.nextBoolean();
		System.out.println("Assign a value to 'makesBreakthrough'.");
		boolean makesBreakthrough = scanner.nextBoolean();
		
		boolean nobelPrizeCandidate = false;
		
		if (doesSignificantWork && makesBreakthrough) {
			nobelPrizeCandidate = true;
		}
		
		System.out.println("nobelPrizeCandidate is " + nobelPrizeCandidate);
	}
}
