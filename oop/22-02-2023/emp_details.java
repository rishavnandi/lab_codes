// wap to display the employee details using scanner class

package 22-02-2023;

import java.util.Scanner;

public class emp_details{
    int id;
    String name;
}

class employee{
    public static void main(String args[]){
        emp_details e1 = new emp_details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the employee");
        e1.id = sc.nextInt();
        System.out.println("Enter the name of the employee");
        e1.name = sc.next();
        System.out.println("The id of the employee is " + e1.id);
        System.out.println("The name of the employee is " + e1.name);
    }
}
