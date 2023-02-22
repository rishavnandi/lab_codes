// wap to take an integer and count the number of digits in the number

package 22-02-2023;

import java.util.Scanner;

public class digit_count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("The number of digits in the number is " + count);
    }
}
