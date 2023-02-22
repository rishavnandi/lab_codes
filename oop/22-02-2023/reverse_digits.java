// wap to reverse the digits of given input

package 22-02-2023;

import java.util.Scanner;

public class reverse_digits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("The reverse of the number is " + rev);
    }
}
