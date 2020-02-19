package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println("Input three numbers");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        scanner = new Scanner(System.in);
        int num3 = scanner.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else {
            System.out.println("Neither increasing nor decreasing");
        }
    }
}
