// WAP for calculator to perform addition, subtraction, multiplication, division using member function and object

class Calculator {
    int num1, num2;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }
}

public class calc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNumbers(10, 5);
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }
}
