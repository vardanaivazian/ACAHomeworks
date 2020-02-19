package am.aca.homework2.tatev;

import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		
		if (num1 == num2 && num2 ==num3 && num3 ==num4)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}
