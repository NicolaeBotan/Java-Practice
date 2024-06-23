package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> data1 = new HashMap<>();

        data1.put("A", 1);
        data1.put("B", 26);
        data1.put("C", 30);
        data1.put("D", 5);

        filter(data1);//[26, 30]
        List<Integer> list1 = filter(data1); //we called the filter method we created
        System.out.println(list1);//[26, 30]
    }

    //create a method that will get a Map as parameter
    //given Map as parameter should be this type Map<String,Integer>
    //this method will find all values from the given map
    //this method will return if the value is greater than 25
    //the method will return those numbers as a List

    public static List<Integer> filter(Map<String, Integer> items) {

        List<Integer> numbers = new ArrayList<>();
        for (Integer value : items.values()) {
            if (value > 25) {
                numbers.add(value);
            }
        }
        //System.out.println(numbers);
        return numbers;
    }

}
