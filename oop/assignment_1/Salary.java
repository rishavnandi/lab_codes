// Write a program that calculates the weekly salary of an employee. The
// employee works 5
// days a week from 9:00 a.m. till 5:00 p.m. The employee is not allowed to
// leave work before
// 5:00 p.m., but he/she may stay after 5:00 p.m. as overtime. The normal hourly
// rate is RS .300
// while the overtime hourly rate is 1.5*hourly rate. 3% tax is deducted from
// the weekly salary
// and thus the employee earns a net salary which is equal to the salary after
// deducting the tax.
// Your program should read the time the employee left work for all the working
// days in a week,
// then calculate and display the weekly salary, the tax as well as the net
// weekly salary. Assume
// that the leaving time of the employee is always an integer. Assume also that
// the employee
// enters correct and valid values while running the program.

package assignment_1;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time;
        int salary = 0;
        int tax;
        int netSalary;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the time the employee left work on day " + i + ": ");
            time = input.nextInt();
            if (time > 17) {
                salary += 300 * 9 + 300 * 1.5 * (time - 17);
            } else {
                salary += 300 * (time - 9);
            }
        }
        tax = (int) (salary * 0.03);
        netSalary = salary - tax;
        System.out.println("The weekly salary is " + salary);
        System.out.println("The tax is " + tax);
        System.out.println("The net weekly salary is " + netSalary);
        input.close();
    }
}

// Output:

// Enter the time the employee left work on day 1: 17
// Enter the time the employee left work on day 2: 17
// Enter the time the employee left work on day 3: 20
// Enter the time the employee left work on day 4: 17
// Enter the time the employee left work on day 5: 20

// The weekly salary is 16200
// The tax is 486
// The net weekly salary is 15714
