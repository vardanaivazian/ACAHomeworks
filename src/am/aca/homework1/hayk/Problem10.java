package am.aca.homework1.hayk;
import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
//	Scanner b = new Scanner(System.in);
	int c, d;
	c = a.nextInt();
	d = a.nextInt();
	System.out.println( "The area of the rectangle is " + c * d );
	System.out.println( "The perimeter of the rectangle is " + ( 2 * ( c + d ) ) );


    }
}
