package Practice;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        using a scanner ,take a sentence that is not separated by space and each word starts with upper case.
        Print given String as separated words with spaces.
        input: IWantToLearnJava
        output : I Want To Learn Java
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence that is not separated by space and each word starts with upper case");
        String str = scanner.nextLine();
        String newStr = "";//create a string to store the new updated string

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if ( i == 0){
                newStr = newStr + letter;
            }else if (letter >= 'A' && letter <= 'Z') {
                newStr = newStr+ " " +letter;
            } else {
                newStr = newStr + letter;
            }

        }
        System.out.println(newStr);
    }
}
