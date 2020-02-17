package am.aca.homework1.hamo;

public class problem4 {
    //           a.
    public static void main(String[] args) {
        int n1 = -5;
        int n2 = 8;
        int n3 = 6;
        System.out.println("-5 + 8 * 6 =" + (n1 + n2 * n3));
//            b.
        int s1 = 55;
        int s2 = 9;
        int s3 = 9;
        System.out.println("(55 + 9) % 9 =" + ((s1 + s2) % s3));
//            c.
        int w1 = 20;
        int w2 = -3;
        int w3 = 5;
        int w4 = 8;
        System.out.println("20 + -3 * 5 / 8 =" + (w1 + w2 * w3 / w4));
//            d.
        int h1 = 5;
        int h2 = 15;
        int h3 = 3;
        int h4 = 2;
        int h5 = 8;
        int h6 = 3;
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 =" + (h1 + h2 / h3 * h4 - h5 % h6));
    }
}
