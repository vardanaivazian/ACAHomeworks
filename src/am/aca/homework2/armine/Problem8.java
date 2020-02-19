package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println("Input your mark to see the grade:");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        String grade = "";

        while (mark < 0 || mark > 100) {
            System.out.println("Invalid mark!");
            System.out.println("Please input a valid mark between [0 - 100]");
            scanner = new Scanner(System.in);
            mark = scanner.nextInt();
        }

        if (mark < 25) {
            grade = "F";
        } else if (mark < 45) {
            grade = "E";
        } else if (mark < 50) {
            grade = "D";
        } else if (mark < 60) {
            grade = "C";
        } else if (mark < 80) {
            grade = "B";
        } else {
            grade = "A";
        }
        System.out.println("Grade is: " + grade);
    }
}
