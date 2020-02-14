package am.aca.homework1.vahan;

public class Homework7 {

    public static void main(String[] args) {
	    //7. Write a Java program to compute a specified formula
        //Specified Formula :
        //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        //Expected Output
        //2.9760461760461765
        System.out.println("Need to count following expression\n4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))\n");
        System.out.println("First way - just make math in System.out.println");
        System.out.println("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))=" + (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
        System.out.println();
        System.out.println("Second way - create variables and put the expressions in () variables\nThen make math in System.out.println using that variables");
        double a = 4.0;
        double b = 1;
        double c = 1.0/3;
        double d = 1.0/5;
        double e = 1.0/7;
        double f = 1.0/9;
        double g = 1.0/11;
        System.out.print("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))=");
        System.out.println(a * (b - c + d - e + f - g));
        System.out.println();
        System.out.println("One more way - add one more variable, count the result in that variable and print it");
        double i = a * (b - c + d - e + f - g);
        String j = "4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))=";
        System.out.println((j) + (i));



    }
}
