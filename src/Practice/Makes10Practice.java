package Practice;

import java.util.Scanner;

public class Makes10Practice {
    public static void main(String[] args) {
        /*
        Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number");
        int b = scanner.nextInt();

        if (a == 10 || b == 10 || a + b == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
