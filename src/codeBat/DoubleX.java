package codeBat;

import java.util.Scanner;

public class DoubleX {
    public static void main(String[] args) {
        /*
        Given a string, return true if the first instance of "x" in the string is immediately
        followed by another "x".
        doubleX("axxbb") → true
        doubleX("axaxax") → false
        doubleX("xxxxx") → true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word that contains 'x'");
        String word = scanner.nextLine();

        boolean answer = true;
        for(int i = 0; i < word.length()- 1; i++){
            if(word.contains("xx")){
               answer = true;
            }else{
               answer = false;
            }
        }
        System.out.println(answer);


    }
}
