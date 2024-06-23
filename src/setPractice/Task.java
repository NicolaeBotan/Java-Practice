package setPractice;

import java.util.HashSet;

public class Task {
    //create a method that will take String[] as parameter,
    // and it will return values as a Set Collection Object
    //{"phone","clock","timer","cup","microphone"}

    public static HashSet<String> convertor(String[] items) {
        HashSet<String> newSet = new HashSet<>();
        for (String item : items) {
            newSet.add(item);
        }
        //System.out.println(newSet);
        return newSet;
    }
    //main method to run our cod
    public static void main(String[] args) {

        String[] itemList = {"phone", "clock", "timer", "cup", "microphone"};

        HashSet<String> setItems = convertor(itemList);
        System.out.println(setItems);//[timer, phone, clock, microphone, cup]

    }

}
