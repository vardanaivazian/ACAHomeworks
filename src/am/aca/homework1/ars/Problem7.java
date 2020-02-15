package am.aca.homework1.ars;

class Problem7 {
    public static void main(String[] args) {
        double a = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(a);

//alternative
        double b = 1;
        System.out.println(b*4* ((b-b/3) + (b/5) - (b/7) + (b/9) - (b/11)));
    }
}




