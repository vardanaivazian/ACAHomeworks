package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Insert number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean result = (x % 2 == 0);
        System.out.println(result);


    }
}
