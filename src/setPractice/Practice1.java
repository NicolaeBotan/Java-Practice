package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        HashSet<String> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        Set<String> set4 = new HashSet<>();

        System.out.println(set2);//[] empty brackets
        //assigning some values

        set2.add("Alex");
        set2.add("Vitally");
        set2.add("Sam");
        set2.add("Jenifer");
        System.out.println(set2);//[Alex, Jenifer, Vitally, Sam]
        //the values are stored randomly, not alphabetic sequence and not in order you assigned them.
        // HashSet has no Order for the elements
        set2.add("Alex");
        System.out.println(set2);//it will not add the duplicate value
        //is not giving any Compile time errors or runt time error but also will not add the value

        //null
        //you can add null as a value
        set2.add(null);
        System.out.println(set2);//[null, Alex, Jenifer, Vitally, Sam]
        //even if it's null value you can still add only one null value to the Set

        //show all elements in the HasSet to be printed one by one
        //you can not use the get() method.
        //if the name is "Alex" say hello Alex
        //because of "null" the If Condition is not going to work
        // it gives a Run Time Error

        //NullPointerException
        //so to skip null we do this != null
        for (String name : set2) {
            if (name != null && name.equalsIgnoreCase("Alex")) {
                System.out.println("Hello " + name);//Hello Alex
            }
            //System.out.println(name);
        }

        //also we can do this to see if we have "Alex" in our HashSet
        boolean result1 = set2.contains("Alex");
        System.out.println(result1);//true

        System.out.println(set2.isEmpty());//false, because it's not empty
        set2.clear();
        System.out.println(set2);//[] now is empty





//
//        //store an Array into the Set but Array will have duplicate elements
//        String[] strs = {"a","b","a"};
//        String[] strs2 = {"a","b","a"};
//        HashSet<String[]> set6 = new HashSet<>();
//        set6.add(strs);
//        System.out.println(set6);//1 elements
//        set6.add(strs2);
//        System.out.println(set6);//2 elements

        HashSet<String> test = new HashSet<>();
        test.add("Denver");
        test.add("Springfield");
        test.add("LA");
        test.add("Columbus");
        filter(test);//the filter method that can take set as a parameter
        /*
        LA ???
        Springfield ***
        Columbus ***
        Denver ***
         */


    }

    // create a method that will take a set parameter
    // this method will filter String elements based on their length
    // len 5 or more will have stars next to it
    // others will have ? next to them

    public static void filter(HashSet<String> data ){

        for(String item : data){
            if (item.length() >= 5){
                System.out.println(item + " ***");

            }else {
                System.out.println(item + " ???");
            }
        }
    }





}
