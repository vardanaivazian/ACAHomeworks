package am.aca.homework2.armine;

import java.util.Locale;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Input two  numbers:" + "\n" +  "First:");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x = scanner.nextDouble();
        System.out.println("Second:");
        scanner = new Scanner(System.in);
        double y = scanner.nextDouble();

        boolean result = (x > 0 && x < 1 && y > 0 && y < 1);
        System.out.println(result);


    }
}