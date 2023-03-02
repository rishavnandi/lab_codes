// wap to take which one is executed first by jvm the static main method or the static block

class First_exec {
    public static void main(String[] args) {
        System.out.println("main method");
    }

    static {
        System.out.println("static block");
    }
}
