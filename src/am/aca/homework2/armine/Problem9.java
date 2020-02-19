package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Input first number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Input second number:");
        scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        boolean result = (x * y > 0 || (x * y == 0 && x + y >= 0));
        System.out.println(result);
    }
}
