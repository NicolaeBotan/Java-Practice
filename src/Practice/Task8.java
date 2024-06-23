package Practice;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        enter one String value
        print only unique letters combined as a String also without any space in the beginning and th end.
        Input: "i am happy"
        output : "i am hpy"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String str = scanner.nextLine();

        //we need to create a String to store back the letters
        String uniqueLetters = "";//value is nothing for now

        for (int i = 0; i < str.length(); i++) {
            String letter = str.charAt(i) + "";//we create this local String to store each character

            if (!uniqueLetters.contains(letter)) { //we create this for knowing if the letter is not in the
                //new string, then add it to the String uniqueLetters

                uniqueLetters = uniqueLetters + letter;
            } else if (letter.equals(" ")) { //this is created to keep the space as a char and also add to
                uniqueLetters = uniqueLetters + letter;  //the new string
            }
        }
        System.out.println(uniqueLetters);

    }
}
