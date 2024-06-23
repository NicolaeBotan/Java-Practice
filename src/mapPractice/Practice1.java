package mapPractice;

import java.util.HashMap;

public class Practice1 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap();
        System.out.println(map);//{} Map is empty
        //Map comes with curley brackets

        map.put("Alex", "Smith");
        map.put("David", "Brown");
        map.put("Mary", "White");
        System.out.println(map);//{Alex=Smith, Davis=Brown, Mary=White}

        //i want to see individual element
        System.out.println(map.get("David"));//Brown
        //so in the get() method you put the key, and it gives you back the value
        //the get() method takes only the key as a parameter

        //we can also store the return value in a new variable
        String valueDavid = map.get("David");
        System.out.println(valueDavid);//Brown


    }
}
