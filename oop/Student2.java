// Intialize an object through reference variable

class Student {
    int id;
    String name;
}

public class Student2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 7;
        s1.name = "Rishav";
        System.out.println(s1.id + " " + s1.name);
    }
}
