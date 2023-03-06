// Create a class Student with following operations
// 1) Create parameterized constructor to initialize the objects
// 2) Create a function isEqual() to check whether the two objects are equal or not which returns the Boolean value and gets two objects
// 3) Print the result in main method if objects are equals or not (take variables as your assumption)

package assignment_1;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean isEqual(Student student) {
        return this.name.equals(student.name) && this.id == student.id;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 1);
        Student student2 = new Student("John", 1);
        System.out.println(student1.isEqual(student2));
    }
}

// Output:

// true
