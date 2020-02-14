package am.aca.homework1.armine;

public class Problem11 {
	
	public static void main(String[] args) {
		
		int x, y, c;
		
		x = 10;
		y = 20;

		c = x + y;
		y = c - y;
		x = c - x;

		System.out.println("x = " + x);
		System.out.print("y = " + y);
		
	}


}
