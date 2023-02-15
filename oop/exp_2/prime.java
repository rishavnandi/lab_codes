package exp_2;
// WAP to print all the prime numbers between 1 to 100 using while loop

public class prime {
    public static void main(String args[]) {
        int n = 100;
        int i = 2;
        while (i <= n) {
            int j = 2;
            boolean isPrime = true;
            while (j < i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                System.out.println(i);
            }
            i++;
        }
    }
}