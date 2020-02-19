package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Input the first number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Input the second number:");
         scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        System.out.println("Input the third number:");
        scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        boolean result = ((x + y) == z);

        System.out.println("The result is: " + result);


    }

}

