package am.aca.homework1.giorgi;

public class Problem11 {

    public static void main( String[] args ) {
        int number1 = 5;
        int number2 = 7;
        int number3 = 777;
        number3 = number2;
        number2 = number1;
        number1 = number3;
        System.out.println( number1 );
        System.out.println( number2 );
        java.util.concurrent.ThreadLocalRandom.current().nextBoolean();
    }
}
