// calculate area of a rectangle using concept of constructor overloading

public class rect_area {
    int length;
    int breadth;
    float len;
    float bre;

    rect_area(int l, int b) {
        length = 10;
        breadth = 20;
        System.out.println("Area of the rectangle is " + length * breadth);

    }

    rect_area(float l, float b) {
        len = l;
        bre = b;
        System.out.println("Area of the rectangle is " + len * bre);
    }

    public static void main(String[] args) {
        rect_area r1 = new rect_area(10, 20);
        rect_area r2 = new rect_area(10.5f, 20.5f);
    }
}