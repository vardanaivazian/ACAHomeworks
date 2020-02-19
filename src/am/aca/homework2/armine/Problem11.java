package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        boolean doesSignificantWork, makesBreakthrough, nobelPrizeCandidate = false;
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        doesSignificantWork = ( x % 2 == 0);
        makesBreakthrough = ( x >= 0 );

        if (doesSignificantWork && makesBreakthrough){
            nobelPrizeCandidate = true;
        }
        System.out.println(nobelPrizeCandidate);


        nobelPrizeCandidate = (doesSignificantWork && makesBreakthrough);
        System.out.println(nobelPrizeCandidate);
    }
}
