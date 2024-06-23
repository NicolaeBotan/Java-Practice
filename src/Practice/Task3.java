package Practice;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Reverse a given String and print it, if they have space in the beginning and at the end then
        remove it. Try doing with for loop or while loop.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any String value");
        String str = scanner.nextLine();
        System.out.println(str);
        //we create another String to store each char reversed in the new String
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        System.out.println(reversedStr);

    }
}
