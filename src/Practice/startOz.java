package Practice;

import java.util.Scanner;

public class startOz {
    public static void main(String[] args) {
        /*
        Given a string, return a string made of the first 2 chars (if present),
        however include first char only if it is 'o' and include the second only if it is 'z',
        so "ozymandias" yields "oz".
        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word...");
        String str = scanner.nextLine();

        if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            System.out.println("oz");
        } else if (str.charAt(0) == 'o') {
            System.out.println(str.charAt(0));
        } else if (str.charAt(1) == 'z') {
            System.out.println(str.charAt(1));
        }
    }

}

