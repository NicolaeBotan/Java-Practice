package setPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {

        //WE WILL COMPARE THE 3 DIFFERENT SET CLASSES
        // HASHSET, LINKED HASHSET, TREE SET

        /*
        HashSet --> NO ORDER , and can store NULL value
        LinkedHashSet --> Insertion ORDER, and can store NULL value
        TreeSet --> Ascending ORDER, NO null value (from lowest to highest, or increasing order)
         */

        HashSet<String> hash = new HashSet<>();                //no order
        LinkedHashSet<String> linked = new LinkedHashSet<>();  //insertion order
        TreeSet<String> tree = new TreeSet<>();                //alphabetic order

        //assigning value to all of them
        hash.add("apple");      linked.add("apple");      tree.add("apple");
        hash.add("orange");     linked.add("orange");     tree.add("orange");
        hash.add("cherry");     linked.add("cherry");     tree.add("cherry");
        hash.add("strawberry"); linked.add("strawberry"); tree.add("strawberry");

        System.out.println(hash);  System.out.println(linked);   System.out.println(tree);

        hash.add(null);          linked.add(null);             //tree.add(null);
        System.out.println(hash);  System.out.println(linked);   System.out.println(tree);

        //using tree set methods
        System.out.println(tree.first());//apple /find first element from TreeSet
        System.out.println(tree.last());//find last element /strawberry
        System.out.println(tree.pollFirst());//apple/the first element was removed
        System.out.println(tree.pollLast());//strawberry/ the last element was removed
        System.out.println(tree);//[cherry, orange] remaining elements
        System.out.println(tree.descendingSet());//[orange, cherry] descending order method

        //adding a value in the sout
        System.out.println(tree.add("Watermelon"));//true, meaning it added the Watermelon
        //the return type of the "add method" is true/false but also adds behind the scene
        System.out.println(tree);//[Watermelon, cherry, orange]

        //adding a watermelon second time is not going to work because we cant add duplicate value
        System.out.println(tree.add("Watermelon"));// this time is false
        //because behind the scene it did not add the same value for the second time

    }
}
