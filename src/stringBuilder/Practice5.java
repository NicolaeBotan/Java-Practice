package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {
    public static void main(String[] args) {

        String[] words = {"code","fish","interview","mock","is","coming","soon"};
        /*
        //reverse every single word
        Example List, list = ["edoc","hsif",...]
        create a method that will take a String array as parameter,
         and will return the Reversed Strings in the String[]
        return them in a List
         */

        //now we will run the reverseWord method
        reverseWord(words);
        //this method will print -->[edoc, hsif, weivretni, kcom, si, gnimoc, noos]


    }

    public static List<String> reverseWord(String[] array) {
        //create a List to store all the reversed Strings
        List<String> list = new ArrayList<>();

        for (String word : array) {

            //we create a string to attach each letter in reverse form
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            list.add(reversed);
        }
        System.out.println(list);
        return list;
    }

}
