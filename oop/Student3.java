// Initialize multiple objects with reference variables

class Student {
    int id;
    String name;
}

public class Student3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.id = 7;
        s1.name = "Rishav";
        s2.id = 8;
        s2.name = "Ayush";
        s3.id = 9;
        s3.name = "Sourav";
        s4.id = 10;
        s4.name = "Shubham";
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
        System.out.println(s3.id + " " + s3.name);
        System.out.println(s4.id + " " + s4.name);

    }
}
