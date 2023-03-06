// Write a Java method to display the first 50 pentagonal numbers.

package assignment_1;

public class Pentagonal {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}

// Output:

// 1 5 12 22 35 51 70 92 117 145
