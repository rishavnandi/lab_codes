// wap to use this keyword to refer the current class parametrized constructor

class This_parametrized {
    int a;
    int b;

    This_parametrized(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        This_parametrized obj = new This_parametrized(10, 20);
        obj.display();
    }
}
