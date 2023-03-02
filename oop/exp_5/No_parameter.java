// wap for a method without parameter and with return type

class No_parameter {
    int a;
    int b;

    int add() {
        return a + b;
    }

    public static void main(String[] args) {
        No_parameter obj = new No_parameter();
        obj.a = 10;
        obj.b = 20;
        System.out.println("a + b = " + obj.add());
    }
}
