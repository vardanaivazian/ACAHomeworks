package am.aca.homework1.vahan;

public class Homework3 {

    public static void main(String[] args) {
            //Method 1
        System.out.println("Divide two numbers and print the result\nGiven number 10 and 2");
        System.out.println("Simple way - Just put numbers and math operation in System.out.println and receive the following output");
        System.out.println(10 / 2);

            //Let define two int variables to use them in code below
        int n1 = 10;
        int n2 = 2;

            //Method 2
        System.out.println("Second way - put numbers in int variables and make math operation in System.out.println.");
        System.out.println(n1 / n2);

            //Method 3
            //Let define one more int variable
        int n3;
        n3 = n1 / n2;
        System.out.println("Third way - put numbers in int variables, define new variable, make math operation in new variable and output it in System.out.println.");
        System.out.println(n3);

            //Method 4
            //And one more int variable
        int n4 = n1 / n2;
        System.out.println("One more way - put numbers in int variables, define new variable and make math operation immediately in that newly crated variable, then output it in System.out.println.");
        System.out.println(n4);

    }
}
