package ifStatement;

import java.util.Scanner;

public class NestedTask {
    public static void main(String[] args) {
    /*
    TASK
    -ask for city name of the user
    -if name is Chicago
      *ask what is the school name
      *if school is Techtorial-->tell user that you are lucky to have EFE!
      *if school is not Techtorial--> please come and visit Techtorial

    -if city is not Chicago --> come to Chicago and visit us
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where do you live?");
        String city = scanner.nextLine();

        if (city.equalsIgnoreCase("Chicago")) {
            System.out.println("What is your school name? ");
            String school = scanner.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky to have EFE!");

            } else {
                System.out.println("Please come and visit Techtorial!");
            }

        } else if (city.equalsIgnoreCase("miami")) {
            System.out.println("You should be attending Miami campus!");
            System.out.println("What is your school name? ");
            String school = scanner.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky to have EFE!");

            } else {
                System.out.println("Please come and visit Techtorial!");
            }

        } else{

            System.out.println("Please come to Chicago and visit us!");
        }


    }
}
