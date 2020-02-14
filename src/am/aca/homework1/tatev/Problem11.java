package am.aca.homework1.tatev;

//swap values of variables without directly assigning them new values and prints them
public class Problem11 {
	public static void main(String[] args) {
		int x = 10;
		int y = 88;
		
		int z;
		
		z = x;
		System.out.println("z - " + z);
		System.out.println("x - " + x);
		
		x = y;
		System.out.println("x - " + x);
		System.out.println("y - " + y);
		
		y = z;
		System.out.println("final y - " + y);
		System.out.println("final x - " + x);
		
	}
}
