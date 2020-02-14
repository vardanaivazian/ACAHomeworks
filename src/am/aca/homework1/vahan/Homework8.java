package am.aca.homework1.vahan;

import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {

//8. Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586
        System.out.println("We have a circle with Radius 7.5");
        System.out.println("Let's count area and perimeter of that circle");
        double R = 7.5;
        double Pi = 3.141592653589793;
        double Pe = 2 * Pi * R;
        double C = Math.pow(R, 2);
        double Ar = Pi * C;
        System.out.println("Perimeter of circle\n2*Pi*R=" + Pe);
        System.out.println("Area of circle\nPi*R^2=" + Ar);
        System.out.println();
        System.out.println("Now you can input the Custom Radius and program will count the Perimeter and Area for you");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Radius - ");
        double CustomR = input.nextDouble();
        double CustomC = Math.pow(CustomR, 2);
        double CustomAr = Pi * CustomC;
        double CustomPe = 2 * Pi * CustomR;
        System.out.println("Perimeter of circle\n2*Pi*R=" + CustomPe);
        System.out.println("Area of circle\nPi*R^2=" + CustomAr);

    }
}
