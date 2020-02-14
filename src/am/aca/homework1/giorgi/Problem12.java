package am.aca.homework1.giorgi;

public class Problem12 {

    public static void main( String[] args ) {
        int number1 = 50;
        int number2 = 10;
        number2 = number1 + number2;
        number1 = number2 - number1;
        number2 = number2 - number1;
        System.out.println( number1 );
        System.out.println( number2 );
    }
}
