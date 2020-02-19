package am.aca.homework2.tatev;

import java.util.Scanner;
import java.util.Locale;
public class Problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		double num = scanner.nextDouble();
		
		if (num > 0)
			System.out.println("positive");
		else if (num < 0)
			System.out.println("negative");
		else
			System.out.println("it is zero");
	}
}
