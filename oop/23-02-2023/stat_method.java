// wap for static method that accept data and return the result

class stat_method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = add(a, b);
        System.out.println("addition of two integer is: " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
