package setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//can have duplicates
        list.add("mac");
        list.add("mac");
        list.add("lenovo");
        list.add("mac");
        list.add("Acer");
        list.add("lenovo");
        System.out.println(list);//[mac, mac, lenovo, mac, Acer, lenovo]

        //find out duplicate elements from the given list
        //use Set in to your solution logic
        //use add();

        //this method will go through each element, and it will see the one that is not adding to the
        //Set,because Set does not accept duplicate elements, and it will print that element that is not adding
        //to the Set
        //to store  the duplicates we will create an ArrayList
        // then we will add them to the ArrayList

        HashSet<String> set = new HashSet<>();//created to see witch one is repeating and is not adding to the Set
        ArrayList<String> duplicates = new ArrayList<>();//created to store the duplicates

        for (String item : list) {
            if (!set.add(item)) {
                duplicates.add(item);
                System.out.println(item);
            }
        }
        System.out.println(duplicates);//[mac, mac, lenovo]

    }
}
