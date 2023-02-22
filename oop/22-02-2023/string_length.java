// wap to take a string and check its length

package 22-02-2023;

import java.util.Scanner;

public class string_length{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        System.out.println("The length of the string is " + str.length());
    }
}
