package am.aca.homework1.vahan;

public class Homework2 {

    public static void main(String[] args) {
		//Task description
	System.out.println("Print the sum of two numbers\nGiven number 4 and 6");

        //Method 1
	System.out.println("Simple way - Just put numbers and math operation in System.out.println and receive the following output");
	System.out.println(4+6);

	    //Let define two int variables to use them in code below
	int n1 = 4;
	int n2 = 6;

	    //Method 2
	System.out.println("Second way - put numbers in int variables and make sum in System.out.println.");
	System.out.println(n1 + n2);

	    //Method 3
        //Let define one more int variable
	int n3;
	n3 = n1 + n2;
	System.out.println("Third way - put numbers in int variables, define new variable for sum, make sum in new variable and output it in System.out.println.");
	System.out.println(n3);

	    //Method 4
        //And one more int variable
	System.out.println("One more way - put numbers in int variables, define new variable and make sum immediately, then, output it in System.out.println.");
	int n4 = n1 + n2;
	System.out.println(n4);

    }
}
