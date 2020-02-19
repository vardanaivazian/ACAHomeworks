package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem6_1 {
    public static void main(String[] args) {
        System.out.println("Input seconds:");
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextLong();
        long minutes = seconds / 60;
        long convertedSeconds = seconds % 60;
        long convertedMinutes = minutes % 60;
        long convertedHours = minutes / 60;
        System.out.println(convertedHours + ":" + convertedMinutes + ":" + convertedSeconds);

    }
}
