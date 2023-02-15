package exp_1;
// WAP too swap two numbers using third variable and without third variable

public class swap {
    public static void main(String args[]) {
        int a = 10, b = 5, c;
        System.out.println("a = " + a + ", b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
