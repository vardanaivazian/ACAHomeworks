package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println("Insert first person's age");
        Scanner scanner = new Scanner(System.in);
        int age1 = scanner.nextInt();
        System.out.println("Insert second person's age");
        scanner = new Scanner(System.in);
        int age2 = scanner.nextInt();
        System.out.println("Insert third person's age");
        scanner = new Scanner(System.in);
        int age3 = scanner.nextInt();
        int maxAge = age1;
        int minAge = age1;
        
        if (age2 > maxAge) {
            maxAge = age2;
        } else {
            minAge = age2;
        }
        if (age3 > maxAge) {
            maxAge = age3;
        } else if (age3 < minAge) {
            minAge = age3;
        }

        System.out.println("The oldest person is: " + maxAge);
        System.out.println("The youngest person is: " + minAge);


    }
}
