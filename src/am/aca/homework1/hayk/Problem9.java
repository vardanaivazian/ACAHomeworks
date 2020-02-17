package am.aca.homework1.hayk;
import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		int d = a.nextInt();
		int e = a.nextInt();
		int f = a.nextInt();
		float b;
		b = ( d + e + f)/3f;
		System.out.println("The average number is " + b);
	}
}
