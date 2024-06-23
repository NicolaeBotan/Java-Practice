package codeBat;

import java.util.Scanner;

public class StringBits {
    public static void main(String[] args) {
        /*
        Given a string, return a new string made of every other char starting with the first,
        so "Hello" yields "Hlo".
        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String input = scanner.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); ) {
            result = result + input.charAt(i);
            i += 2;
        }
        System.out.println(result);
    }
}
