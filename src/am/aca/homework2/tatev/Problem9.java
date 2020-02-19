package am.aca.homework2.tatev;/*
 * Write a java statement that prints true if x and y have the same sign 
 */
import java.util.Scanner;
import java.util.Locale;
public class Problem9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if (x < 0 && y < 0 || x >0 && y > 0 || x == 0 && y == 0) 
			System.out.println("true");
		else
			System.out.println("false");
	}
}
