package Practice;

import java.util.Scanner;

public class ParrotPractice {
    public static void main(String[] args) {
        /*
        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        Return true if we are in trouble.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the hour! Number between 0 and 23");
        int hour = scanner.nextInt();

        if (hour < 7 || hour > 20) {
            System.out.println("We are in trouble!!!");
        } else {
            System.out.println("We are not in trouble.");
        }
    }
}
