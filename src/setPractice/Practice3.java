package setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();//can have duplicates
        list.add("mac");
        list.add("mac");
        list.add("mac");
        list.add("Acer");
        list.add("lenovo");

        HashSet<String> set = new HashSet<>(list);//here we created the HashSet and assigned the list value
        //can not have duplicates

        System.out.println("List --> " + list);//[mac, mac, mac, Acer, lenovo]
        System.out.println("Set --> " + set);//[Acer, lenovo, mac] can not have duplicate elements

        //ITERATOR Object
        //it's a method that goes over the SET in cycles like a loop
        // this is another method to go over each element in the Collection/Set Collection
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());//it will print out each element
        }
        System.out.println("-------------------------");

        //Different example with our list
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());//it will show every element from list collection
        }

    }
}
