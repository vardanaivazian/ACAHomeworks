package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println("Input the first number:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Input the second number:");
        scanner = new Scanner(System.in);
        double y = scanner.nextDouble();
        System.out.println("Input the operator:");
        scanner = new Scanner(System.in);
        String operator = scanner.next();

        double result = 0;
        boolean isValidCase = true;
        if (operator.equals("/") && y == 0) {
            System.out.println("Can't divide by zero!");
        } else {
            switch (operator) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    result = x / y;
                    break;
                default:
                    System.out.println("Invalid operator");
                    isValidCase = false;
                    break;
            }
            if (isValidCase) {
                System.out.println(x + " " + operator + " " + y + " = " + result);
            }
        }
    }
}
