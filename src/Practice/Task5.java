package Practice;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Ask the user to give a number between 1 and 10.
        Write a program that will print in the following format:
        Input 5
        Output:
        1
        22
        333
        4444
        55555
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter eny number between 1 and 10");
        int num = scanner.nextInt();//we store the number

        for (int i = 1; i <= num; i++) {

            for (int k = 1; k <= i; k++) {  //we need the second loop for printing the numbers next to each
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
