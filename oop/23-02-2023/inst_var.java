// wap to check whether a static method can access the instance variable or not

class inst_var {
    static int a = 20;

    public static void main(String[] args) {
        System.out.println("instance variable is: " + a);
    }
}
