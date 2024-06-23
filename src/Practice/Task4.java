package Practice;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Using the Scanner ask user to give two numbers, the min and max.
        Write a Java code that will calculate the sum of the numbers in the range between
        the given two numbers that can only be divided by 3 and 11.
        Min and max are included.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a min number");
        int min = scanner.nextInt();
        System.out.println("Please enter the max number");
        int max = scanner.nextInt();

        //we need to create a variable to sum all the numbers
        int sum = 0;

        for (int i = min; i <= max; i++) {

            if (i % 3 == 0 && i % 11 == 0) {

                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
