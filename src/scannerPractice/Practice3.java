package scannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // we will figure out initials of a person
        // John Deere--> J D
        System.out.println("Enter the first name");
        // to take string data, nextLine() or next()
        char firstInitial = scanner.nextLine().charAt(0);//first position in Java is starting with 0
        System.out.println(firstInitial);//shows upper case J
        //please do above process for his last name
        System.out.println("Enter your last name");
        char lastInitial = scanner.nextLine().charAt(0);
        System.out.println(lastInitial);
        //can we combine first and last initials?
        System.out.println("" + firstInitial + lastInitial);// for Java to be able to use char value as
        // but not as decimal value from ASCII table we need to put "" with no space and +
        // JOHN DEERE








    }
}
