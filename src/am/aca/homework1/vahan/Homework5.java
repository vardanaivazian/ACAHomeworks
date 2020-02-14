package am.aca.homework1.vahan;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {
	    //Method 1
    System.out.println("First way - just make math in System.out.println\nLet say we have two numbers - 12 and 6");
    System.out.println("12+6=" + (12 + 6));
    System.out.println("12-6=" + (12 - 6));
    System.out.println("12*6=" + (12 * 6));
    System.out.println("12/6=" + (12 / 6));
    System.out.println("12&6=" + (12 & 6));

        //Method 2
    int a = 12;
    int b = 6;
    System.out.println("Second way - create two variables\na=12\nb=6");
    System.out.println("a+b=12+6=" + (a + b));
    System.out.println("a-b=12-6=" + (a - b));
    System.out.println("a*b=12*6=" + (a * b));
    System.out.println("a/b=12/6=" + (a / b));
    System.out.println("a&b=12&6=" + (a & b));

        //Method 3
    System.out.println("Let do it with custom numbers");
    Scanner input = new Scanner(System.in);
    System.out.println("Input number for In1 ");
    int In1 = input.nextInt();
    System.out.println("Input number for In2 ");
    int In2 = input.nextInt();
        System.out.println("In1+In2=" + (In1 + In2));
        System.out.println("In1-In2=" + (In1 - In2));
        System.out.println("In1*In2=" + (In1 * In2));
        System.out.println("In1/In2=" + (In1 / In2));
        System.out.println("In1&In2=" + (In1 & In2));

    }
}
