// wap to display the employee details using scanner class

import java.util.Scanner;

class emp_details {
    int id;
    String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        emp_details e = new emp_details();
        System.out.println("Enter the employee id: ");
        e.id = sc.nextInt();
        System.out.println("Enter the employee name: ");
        e.name = sc.next();
        System.out.println("Employee id: " + e.id);
        System.out.println("Employee name: " + e.name);
        sc.close();
    }
}
