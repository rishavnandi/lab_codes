// Write a program that reads in from the user a character (ch), an integer (n) and another
// character (operator). This operator is an indication of the operation applied to (ch) and (n)
// entered as follows: - When (operator) character entered is ‘p’ or ‘P’, your program displays the
// character that comes after (ch) entered in (n) positions. - When (operator) character entered is
// ‘s’ or ‘S’, your program displays the character that precedes (ch) entered with (n) positions. -
// When (operator) character entered is ‘m’ or ‘M’, your program displays the character resulting
// of the multiplication of the value of (ch) entered by the value of (n). - Any other entry for the
// operator displays a message: Incorrect operation

package assignment_1;

import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        int n;
        char operator;
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);
        System.out.print("Enter an integer: ");
        n = input.nextInt();
        System.out.print("Enter an operator: ");
        operator = input.next().charAt(0);
        if (operator == 'p' || operator == 'P') {
            System.out
                    .println("The character that comes after " + ch + " in " + n + " positions is " + (char) (ch + n));
        } else if (operator == 's' || operator == 'S') {
            System.out.println("The character that precedes " + ch + " in " + n + " positions is " + (char) (ch - n));
        } else if (operator == 'm' || operator == 'M') {
            System.out.println("The character resulting of the multiplication of the value of " + ch
                    + " by the value of " + n + " is " + (char) (ch * n));
        } else {
            System.out.println("Incorrect operation");
        }
        input.close();
    }
}

// Output:

// Enter a character: a
// Enter an integer: 3
// Enter an operator: p
// The character that comes after a in 3 positions is d

// Enter a character: a
// Enter an integer: 3
// Enter an operator: s
// The character that precedes a in 3 positions is x

// Enter a character: a
// Enter an integer: 2
// Enter an operator: m
// The character resulting of the multiplication of the value of a by the value
// of 2 is c

// Enter a character: a
// Enter an integer: 2
// Enter an operator: x
// Incorrect operation
