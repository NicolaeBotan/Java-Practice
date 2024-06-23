package ifStatement;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*TASK----
    -get a single letter from the user
    -when the letter is "M" or "m"---It is Monday
    - 'T' or 't' -->tuesday or Thursaday
    - 'W' or 'w' --> wednesday */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any letter");
        String letter = scanner.nextLine();

        if( letter.equals("M")  || letter.equals("m") ) {

             System.out.println("It is Monday");
         }

         if( letter.equals("T") || letter.equals("t")) {

             System.out.println(" It is Tuesday or Thursday");
         }

         if( letter.equals("W") || letter.equals("w")){

             System.out.println("It is Wednesday");
         }
        //cover the cases when the incoming letter is different then one we have

         if( !letter.equals("M") && !letter.equals("m") && !letter.equals("T") && !letter.equals("t") &&
         !letter.equals("W") && !letter.equals("w")) {

             System.out.println("Invalid entry");
         }







    }
}
