// WAP to print student details using object

class student {
    String name;
    int roll;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class student_detail {
    public static void main(String args[]) {
        student s1 = new student();
        s1.name = "Rishav";
        s1.roll = 1;
        s1.marks = 100;
        s1.display();
        student s2 = new student();
        s2.name = "Ayush";
        s2.roll = 2;
        s2.marks = 99;
        s2.display();
    }
}
