package scannerPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//so 1 Scanner is enough per Class

        System.out.println("How is the weather this morning? ");
        String answer = input.nextLine(); // data that comes from user
        System.out.println("The weather today is " + answer);
        System.out.println("What day is Today? ");
        String nameOfDay = input.nextLine(); // data that comes from user
        System.out.println("So, it is a " +answer + " " + nameOfDay);

         // next() --> will take a String till first space
        System.out.println("Which city is this? ");
        String city = input.next();// so if you put New York ( is going to Show only "New" because
                                   // we used only "input.next()" not "input.nextLine()"
        System.out.println("So, it is a " +answer + " " + nameOfDay +  " in " + city);
        // Ask user for the zip code, store it and double check with user by printing back
        System.out.println(" What is the zip code for your city? " );
        int zipCode = input.nextInt();
        System.out.println("Are you sure this is the correct zip code? " + zipCode);
        String correctZip = input.next();
        System.out.println(zipCode);
    }
}
