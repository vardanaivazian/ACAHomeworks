package am.aca.homework1.hayk;
import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
	Scanner a = new Scanner (System.in);
	Scanner b = new Scanner (System.in);
	Scanner c = new Scanner (System.in);
	int d = a.nextInt();
	int e = b.nextInt();
	int f = c.nextInt();
	if ( d > e && d > f)
	    System.out.println(" The average number is = " + d);
	else if ( e > d && e > f )
	    System.out.println(" The average number is = " + e);
	else
        System.out.println(" The average number is = " + f);
    }
}
