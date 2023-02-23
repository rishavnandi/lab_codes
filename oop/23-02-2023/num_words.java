// wap to convert number to words

import java.util.Scanner;

class num_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number in words: " + numToWords(num));

        sc.close();
    }

    static String numToWords(int num) {
        String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String[] tens = { "zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };

        String result = "";

        if (num < 10) {
            result = ones[num];
        } else if (num < 20) {
            result = teens[num - 10];
        } else if (num < 100) {
            result = tens[num / 10] + " " + ones[num % 10];
        } else if (num < 1000) {
            result = ones[num / 100] + " hundred " + numToWords(num % 100);
        } else if (num < 100000) {
            result = numToWords(num / 1000) + " thousand " + numToWords(num % 1000);
        } else if (num < 10000000) {
            result = numToWords(num / 100000) + " lakh " + numToWords(num % 100000);
        } else if (num < 1000000000) {
            result = numToWords(num / 10000000) + " crore " + numToWords(num % 10000000);
        } else {
            result = "Number too large";
        }

        return result;
    }
}