package ifStatement;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        /*Task:
ask user to give you a number between 1 and 5
-print out day name for related number

 input --> 1--> Monday
           2-->Tuesday
           3-->Wednesday
           4-->Thursday
           5-->Friday
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number between 1 and 5");
        int number = scanner.nextInt();

        if ( number == 1){
            System.out.println("Monday");
        }

        if ( number == 2){
            System.out.println("Tuesday");
        }

        if( number == 3){
            System.out.println( "Wednesday");
        }
        if( number == 4){
            System.out.println("Thursday");
        }
        if( number == 5){
            System.out.println("Friday");
        }

        if ( number > 5 || number <1 ){
            System.out.println("There is no matching day for your entry");
        }

        System.out.println("Please type any text");
        scanner.nextLine();
        String text = scanner.nextLine();

        if ( text.startsWith("h") && text.length() > 10 ){
            System.out.println("This is what I am looking for");
        }



    }
}
