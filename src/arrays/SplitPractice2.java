package arrays;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {

        String str = "The FIFA World Cup, often simply called the World Cup, is an international association" +
                " football competition between the senior men's national teams of the members of " +
                "the Fédération Internationale de Football Association (FIFA), the sport's global governing" +
                " body. The tournament has been held every four years since the inaugural tournament in 1930, " +
                "with the exception of 1942 and 1946 due to the Second World War.";
        //find out words that have even numbers of characters
        //print out those
        str = str.replace(".", "");
        str = str.replace(",", "");
        str = str.replace("(", "");
        str = str.replace(")", "");
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        int i = 0;
        for (; i < words.length; i++) {

            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);

            }
        }

    }
}
