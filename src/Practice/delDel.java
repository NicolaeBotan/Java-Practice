package Practice;

import java.util.Scanner;

public class delDel {
    public static void main(String[] args) {
        /*
        Given a string, if the string "del" appears starting at index 1,
        return a string where that "del" has been deleted. Otherwise, return the string unchanged.
        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String input = scanner.nextLine();

        if (input.length() >= 4 && input.substring(1, 4).equals("del")) {
            System.out.println(input.substring(0, 1) + input.substring(4));
        } else {
            System.out.println(input);
        }
    }
}
