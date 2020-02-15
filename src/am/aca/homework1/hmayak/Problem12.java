package am.aca.homework1.hmayak;

public class Problem12
{
public static void main (String[] args)
	{
		int x = 7;
		int y = 8;
		int c = x+y;
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}