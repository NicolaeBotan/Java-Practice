package ifStatement;

import java.util.Scanner;

public class ElsePractice2 {
    public static void main(String[] args) {
        /*TASK
    -ask user if they have driver license
    - if answer is yes print "You are great"
    - if answer is something else print "DMW is next door, please visit" */

        Scanner scanner = new Scanner(System.in); // scanner is the name of the Scanner
        System.out.println("Do you have a Driver License? ");

        String answer = scanner.nextLine();// scanner is the name of the Scanner

        if( answer.equalsIgnoreCase("yes")) {   //so we need to put ignoreCase so get the correct
            System.out.println("You are great");            // answer that user can type
        }else{
            System.out.println("DMW is next door, please visit.");
        }










    }
}
