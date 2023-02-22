// Initialize object through method

class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

class Student4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(7, "Rishav");
        s2.insertRecord(8, "Ayush");
        s1.displayInformation();
        s2.displayInformation();
    }
}
