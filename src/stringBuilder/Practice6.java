package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {

        //reverse() method comes from StringBuilder class

        StringBuilder builder = new StringBuilder("Welcome");
        System.out.println(builder);//Welcome

        builder.reverse();
        System.out.println(builder);//emocleW

        //toString() method
        //will convert the StringBuilder to String

        String str = builder.toString();
        System.out.println(str.toUpperCase());//EMOCLEW

        //method reverse()
        String[] words = {"code", "fish", "interview", "mock", "is", "coming", "soon"};
        reverseWord(words);
        //[edoc, hsif, weivretni, kcom, si, gnimoc, noos]

    }

    public static List<String> reverseWord(String[] array) {
        //create a List to store all the reversed Strings
        List<String> list = new ArrayList<>();

        for (String word : array) {
            StringBuilder builder = new StringBuilder(word);

            //this will reverse the StringBuilder,change from StringBuilder to String and add to the list
            list.add(builder.reverse().toString());

        }
        System.out.println(list);
        return list;
    }
}
