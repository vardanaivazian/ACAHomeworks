package am.aca.homework1.tatev;

//swap values without using additional variables
public class Problem12 {
	public static void main(String[] args) {
		int x = 10;
		int y = 88;

		x = x + y;
		System.out.println("x - " + x);
		
		y = x - y;
		System.out.println("x - " + x);
		System.out.println("y - " + y);
		
		x = x - y;
		System.out.println("final y - " + y);
		System.out.println("final x - " + x);		
	}
}
