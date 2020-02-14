package am.aca.homework1.vahan;

public class Homework4 {

    public static void main(String[] args) {
    //Task description

    System.out.println("Given few tasks \n A. -5 + 8 * 6 \n B. (55+9) % 9 \n C. 20 + -3*5 / 8 \n D. 5 + 15 / 3 * 2 - 8 % 3\n");

        //Method 1
    System.out.println("Simple way - Just put digits and math operation in System.out.println and receive the following output\n");
    System.out.println("For A - " + (-5 + 8 *6));
    System.out.println("For B - "+ ((55 + 9) % 9));
    System.out.println("For C - " + (20 + -3*5 / 8));
    System.out.println("For D - " + (5 + 15 / 3 * 2 - 8 % 3));
    System.out.println();
        //Let define int variables to use them in code below
            //For a
            int a1 = 5;
            int a2 = 8;
            int a3 = 6;
            //for b
            int b1 = 55;
            int b2 = 9;
            //for c
            int c1 = 20;
            int c2 = 3;
            int c3 = 5;
            int c4 = 8;
            //for d
            int d1 = 5;
            int d2 = 15;
            int d3 = 3;
            int d4 = 2;
            int d5 = 8;

        //Method 2
    System.out.println("Second way - put digits in int variables and make math in System.out.println.\nAs result we receive the following output\n");
    System.out.println(("For A - ") +(- a1 + a2 * a3));
    System.out.println(("For B - ") + ((b1 + b2) % b2));
    System.out.println(("For C - ") + (c1+ - c2 * c3 / c4));
    System.out.println(("For D - ") + (d1 + d2 / d3 * d4 - d5 % d3));
    System.out.println();

        //Method 3
    int Ra;
    int Rb;
    int Rc;
    int Rd;

    Ra = - a1 + a2 * a3;
    Rb = (b1 + b2) % b2;
    Rc = c1+ - c2 * c3 / c4;
    Rd = d1 + d2 / d3 * d4 - d5 % d3;
    System.out.println("Third way - put digits in int variables, define new variables for math formulas, make math in new variables and output them in System.out.println.\nAs result we receive the following output\n");
    System.out.println(("For A - ") + Ra);
    System.out.println(("For B - ") + Rb);
    System.out.println(("For C - ") + Rc);
    System.out.println(("For D - ") + Rd);

    }
}
