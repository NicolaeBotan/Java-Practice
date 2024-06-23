package Practice;

import java.util.Scanner;

public class in3050 {
    public static void main(String[] args) {

       /* Given 2 int values, return true if they are both in the range 30..40 inclusive,
       or they are both in the range 40..50 inclusive.
        in3050(30, 31) → true
        in3050(30, 41) → false
        in3050(40, 50) → true
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 >= 30 && num1 <= 40 && num2 >= 30 && num2 <= 40 ||
                num1 >= 40 && num1 <= 50 && num2 >= 40 && num2 <= 50) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
