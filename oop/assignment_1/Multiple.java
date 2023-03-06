// Write a program that prompts the user to enter an integer and displays whether the number
// is a multiple of 4 or not. The program stops reading integers, when the user inputs a negative
// value. It shows at the end the total number of values entered which are multiple of 4.

package assignment_1;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        while (number >= 0) {
            if (number % 4 == 0) {
                count++;
            }
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        }
        System.out.println("The total number of values entered which are multiple of 4 is " + count);
        input.close();
    }
}

// Output:

// Enter an integer: 4
// Enter an integer: 8
// Enter an integer: 12
// Enter an integer: 15
// Enter an integer: -1

// The total number of values entered which are multiple of 4 is 3
