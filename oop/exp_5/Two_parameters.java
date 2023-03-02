// wap for a method with two parameters and without return type

class Two_parameters {
    int a;
    int b;

    void display(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        Two_parameters obj = new Two_parameters();
        obj.display(10, 20);
    }
}
