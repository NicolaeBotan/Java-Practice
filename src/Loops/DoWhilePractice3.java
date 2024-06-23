package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhilePractice3 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        for that given number create a star tree like following
        --> user enters 5 -->
        *
        **
        ***
        ****
        *****
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number!");
        int number = scanner.nextInt();
        String str = "*";

        do {
            System.out.println(str);
            str = str.concat("*");//this will attach * to the String "*"
            number--;

        } while (number > 0);

    }
}
