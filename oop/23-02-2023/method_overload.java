// wap of method overloading by changing number of arguments and datatypes of arguments

class method_overload {
    public static void main(String[] args) {
        method_overload obj = new method_overload();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5f, 20.5f);
    }

    void add(int a, int b) {
        System.out.println("addition of two integer is: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("addition of three integer is: " + (a + b + c));
    }

    void add(Float a, Float b) {
        System.out.println("addition of two float is: " + (a + b));
    }
}
