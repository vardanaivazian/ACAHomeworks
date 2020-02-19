package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Input four numbers:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        String result = null;
        if (x == y && x == z && x == w) {
            result = "equal";
        } else {
            result = "not equal";
        }
        System.out.println(result);


    }
}
