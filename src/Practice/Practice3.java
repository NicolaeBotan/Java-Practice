package Practice;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
         /*Task: get a string from user via scanner and:
        -print:
              -first char
              -last char
              -index of second matching letter 'c'
              -length of string
              -index of x
              -middle char
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String userWord = scanner.nextLine();
        System.out.println(userWord.charAt(0));//first char
        System.out.println(userWord.charAt( userWord.length() -1 ) );//last char
        System.out.println( userWord.indexOf('c', userWord.indexOf('c') + 1)  );//second "C" from index
        System.out.println(userWord.length() );//length
        System.out.println(userWord.indexOf('x'));
        System.out.println(userWord.charAt(userWord.length() / 2) );//middle char

    //contains();--> boolean
        String str = "water";
        boolean b = str.contains("w");
        boolean b1 = str.contains("ter");
        System.out.println(b);//true
        System.out.println(b1);//true
        System.out.println(str.contains("thb"));//false

        System.out.println( str.startsWith("wat") != str.contains("ter") );//false
                        // this is "true" not equals this is true ==> false
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    //equals(); --> boolean
        System.out.println( str.equals("Water"));//false
        System.out.println( str.equals("WATER"));//false
        System.out.println( str.equals("water"));//true
        str = str.toUpperCase();
        System.out.println( str.toUpperCase() );
        System.out.println(str.equals("WATER"));//true

    //equalsIgnoreCase(); return boolean

        System.out.println( str.equalsIgnoreCase("WaTeR"));//true because ignores the Case
        System.out.println( str.equalsIgnoreCase("ater"));//false




    }
}
