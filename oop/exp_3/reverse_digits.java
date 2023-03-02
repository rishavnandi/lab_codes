// wap to reverse the sum digits of given input

import java.util.Scanner;

public class reverse_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of the digits is " + sum);
        int rev = 0;
        while (sum > 0) {
            rev = rev * 10 + sum % 10;
            sum = sum / 10;
        }
        System.out.println("The reverse of the sum is " + rev);
        sc.close();
    }
}
