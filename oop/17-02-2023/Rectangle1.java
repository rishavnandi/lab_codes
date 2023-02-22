class Rectangle {
    int length;
    int width;

    void Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        System.out.println(length * width);
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.Rectangle(15, 5);
        r2.Rectangle(8, 15);
        r1.calculateArea();
        r2.calculateArea();
    }
}
