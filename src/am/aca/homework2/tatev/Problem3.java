package am.aca.homework2.tatev;

import java.util.Scanner;
import java.util.Locale;
public class Problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		if (num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
