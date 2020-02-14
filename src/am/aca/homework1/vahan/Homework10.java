package am.aca.homework1.vahan;

import java.util.Scanner;

public class Homework10 {

    public static void main(String[] args) {
	// write your code here
        //P=2(x+y)
        //A=x⋅y
        System.out.println("Let's calculate the Perimeter and Area of rectangle\nHeight - 5\nWidth - 4");
        System.out.println();
        int x = 5;
        int y = 4;
        int Pe = 2 * (x + y);
        int Ar = x * y;
        System.out.println("Perimeter - " + Pe);
        System.out.println("Area - " + Ar);
        System.out.println();
        System.out.println("Now you can input the Custom Height and Width and program will calculate the Perimeter and Area for you");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Height - ");
        int CustomX = input.nextInt();
        System.out.println("Please enter the Width - ");
        int CustomY = input.nextInt();
        int CustomPe = 2 * (x + y);
        int CustomAr = x * y;
        System.out.println("Perimeter - " + CustomPe);
        System.out.println("Area - " + CustomAr);
    }
}
