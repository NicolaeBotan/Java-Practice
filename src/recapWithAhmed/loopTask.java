package recapWithAhmed;

import java.util.Scanner;

public class loopTask {
    public static void main(String[] args) {

        /*
        USING SCANNER: Ask user to enter one String value with 3 words
                 1- Print first letter of each word.
                 2- Print last letter of each word
                 3- Print the total index of first letters.
                 4- Print the sum of the last letter of each word's index number.
                 5- Print the difference between total last index and total first index.

        CLUES: I would use If Condition for charAt and ' '

        EXAMPLE: "Ahmet Loves Java";
        output: ALJ
        output: tsa
        output: 18
        output: 29
        output:11

        Note: You can use either one or two loops
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 words");
        String str = scanner.nextLine().trim();// we use trim here to make sure that they didnt put space at the
        // beginning or at the end
        //create one bucket to store every first letter
        String firstLetters = "";
        String lastLetters = "";
        firstLetters = firstLetters + str.charAt(0);//we do this to assign the First Letter of the first word

        //We will crete a bucket to store the index numbers
        int indexFirstLetter = 0;
        int indexLastLetter = 0;
        //to be able to Iterate each of the letters we need a loop
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                firstLetters += str.charAt(i + 1);//to get the next letter after space
                lastLetters += str.charAt(i - 1);// to get the letter before space
                indexFirstLetter += i + 1; //to add the FirstLetter index numbers
                indexLastLetter += i - 1;// to add the last letters index numbers
            }
        }
        lastLetters += str.charAt(str.length() - 1); //this is implemented to attach the last letter of the last
        //word, because there is no space, and it will not change the position, it will be always the last letter

        indexLastLetter += str.length() - 1;// to add the index of the last letter

        System.out.println(firstLetters); //ALJ
        System.out.println(lastLetters); //tsa
        System.out.println(indexFirstLetter);//18
        System.out.println(indexLastLetter);//29

        //WE WILL USE TERNARY OPERATOR TO COMPARE
        int result = indexFirstLetter > indexLastLetter ? indexFirstLetter - indexLastLetter :
                indexLastLetter - indexFirstLetter;
        System.out.println("The difference between index numbers is " + result);
    }
}
