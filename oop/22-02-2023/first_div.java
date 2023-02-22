// wap to take an integer input and find its 1st division

package 22-02-2023;

import java.util.Scanner;

public class first_div{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
