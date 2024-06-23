package codeBat;

import java.util.Scanner;

public class FrontTimes {
    public static void main(String[] args) {
        /*
        Given a string and a non-negative int n, we'll say that the front of the string
        is the first 3 chars, or whatever is there if the string is less than length 3.
        Return n copies of the front;
        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();
        System.out.println("Please enter any positive digit");
        int num = scanner.nextInt();
        String result = "";

        if (str.length() < 3) {
            System.out.println(str);
        } else {
            for (int i = 1; i <= num; i++) {
                result = result.concat(str.substring(0, 3));
            }
        }
        System.out.println(result);

    }
}
