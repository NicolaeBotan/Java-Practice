package Practice;

import java.util.Scanner;

public class SumPractice {
    public static void main(String[] args) {
        /*
        given 2 integer values, return their sum
        unless the 2 values are the same ,the return double their sum
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scanner.nextInt();
        int sum1 = 0, sum2 = 0;

        if (num1 != num2) {

            System.out.println("SUM of " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else {
            System.out.println("Double Sum of " + num1 + " and " + num2 + " is " + (num1 + num2) * 2);
        }

    }
}
