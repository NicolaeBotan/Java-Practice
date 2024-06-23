package scannerPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        //I will print my first name
        String firstName = "Nicolae";
        System.out.println("My first name is " +firstName);
        //I want to get last name from user and print --> "your last name is:....."
        Scanner scanner = new Scanner(System.in);

        String lastName = scanner.nextLine();

        System.out.println(lastName);
        System.out.println("Your last name is: " + lastName);

        lastName = lastName + "$$$";
        System.out.println(lastName);

        System.out.println("=====================================");

        //get name of the city from user and say "Alex Brown, you are living in ... "

        String firstName1 = scanner.nextLine();

        String lastName1 = scanner.nextLine();//the scanner is reusable

        String city = scanner.nextLine();
        System.out.println( firstName1 + " " + lastName1 + " lives in " + city );
    }
}
