package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice5 {
    public static void main(String[] args) {
        /*
        String str = "Soccer is the best";
        count numbers of each letter from given string
        S - 1
        o - 1
        c - 2
        e - 1
        r - 1
        ...
        t - 3
        use Map
         */
        String str = "Soccer is the best sport";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String str1 = "" + str.charAt(i);//we created this String str1 because we declared when we created
            //the Map that we will pass String as key value, otherwise we could declare as a Character

            if (map.containsKey(str1)) {//this will show us if the letter is repeating,if its true goes inside
                map.put(str1, map.get(str1) + 1);//if the letter repeats we add 1 to the value
            } else {
                map.put(str1, 1);
            }
        }
        System.out.println(map);

    }
}
