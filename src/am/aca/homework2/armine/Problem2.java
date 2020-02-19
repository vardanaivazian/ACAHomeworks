import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        if (x > 0) {
            System.out.println(x + " is positive");
        } else if (x < 0) {
            System.out.println(x + " is negative");
        } else {
            System.out.println("Zero is neither positive nor negative");
        }

    }
}
