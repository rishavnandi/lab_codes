// wap to access a instance variable x and a local variable x from the method access

class Access_method {
    int x = 10;

    void access() {
        int x = 20;
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
    }

    public static void main(String[] args) {
        Access_method obj = new Access_method();
        obj.access();
    }
}
