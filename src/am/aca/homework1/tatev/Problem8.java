package am.aca.homework1.tatev;

//Write a Java program to print the area and perimeter of a circle.
public class Problem8 {
	public static void main(String[] args) {
		double r = 7.5;
			
		double area = Math.PI*Math.pow(r,2);
		double perimeter = 2 * Math.PI * r;
	
		System.out.println(area);
		System.out.println(perimeter);
	}
}
