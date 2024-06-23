package Practice;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one number between 1 and 10.
        Print the String in the following format:
        input 6
        output:
        666666
        55555
        4444
        333
        22
        1
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number between 1 and 10");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            for (int k = i; k > 0; k--) {
                System.out.print(i);
            }
            System.out.println();//to separate the lines of numbers
        }
    }
}
