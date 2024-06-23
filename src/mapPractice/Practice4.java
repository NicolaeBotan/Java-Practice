package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();

        map.put("Alex", "7");
        map.put("David", "6");
        map.put("Messi", "10");
        map.put("Hagi", "10");

        //implementing the method
        addMessage(map);
        /*
        Alex is the best key with value 7
        David is the best key with value 6
        Hagi is the best key with value 10
        Messi is the best key with value 10
         */
    }

    /*
    create a method that will take a Map as parameter
    this method will add a message to each key as follows:
    "...is the best key"
    //print out the values
    */
    public static void addMessage(Map<String, String> map) {

        for (String key : map.keySet()) {
            System.out.println(key + " is the best key with value " + map.get(key));


        }
    }


}