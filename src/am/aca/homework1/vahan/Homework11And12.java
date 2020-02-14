package am.aca.homework1.vahan;

public class Homework11And12 {

    public static void main(String[] args) {
	// Method 1 - with 3th variable
        int x = 10;
        int y = 88;
        int z;
        System.out.println("We have two numbers in variables\nx=" + x + "\ny=" + y);
        z = x;
        x = y;
        y = z;
        System.out.println("Now we Swap values in variables by using 3th variable\nAs the result\nx=" + x + "\ny=" + y);
        System.out.println();

    //Method 2 - without 3th variable

        int a = 55;
        int b = 105;
        System.out.println("Now we have another two numbers in variables\na=" + a + "\nb=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Let Swap values in variables without using 3th variable\nAs the result\na=" + a + "\nb=" + b);

    }
}
