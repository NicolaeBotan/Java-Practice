package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {
        //we will use the HashMap

        HashMap<Integer, String> map = new HashMap();

        // assigning values to map
        map.put(10, "Alex");
        map.put(20, "Sam");
        map.put(30, "Tom");

        System.out.println(map);//{20=Sam, 10=Alex, 30=Tom}
        //HashMap is using HashSet for its structure so that's why is coming in random order

        //reaching the values individually
        //using the key as parameter and getting the value
        map.get(30);//Tom
        System.out.println(map.get(30));//Tom

        map.put(20, "Vitally");//if the key is existing in the Map, the value will be reassigned
        System.out.println(map);//{20=Vitally, 10=Alex, 30=Tom}
        //if the key is not in the Map , it will just create another value with the new key we give

        //we can have same value BUT Different KEYS
        map.put(40, "Natalie");
        map.put(50, "Natalie");
        map.put(60, "Natalie");
        map.put(70, "Natalie");
        System.out.println(map);
        //{50=Natalie, 20=Vitally, 70=Natalie, 40=Natalie, 10=Alex, 60=Natalie, 30=Tom}

        //how to reach out all values individually
        //{50=Natalie, 20=Vitally, 70=Natalie, 40=Natalie, 10=Alex, 60=Natalie, 30=Tom}

        System.out.println(map.get(10)); //Alex
        System.out.println(map.get(20)); //Vitally
        System.out.println(map.get(30)); //Tom
        //...
        //how can I have all keys on hand?
        //****keySet(); method will return all keys from the Map

        //map.keySet(); //return data type for all keys is Set,because they are coming all together
        Set<Integer> keys = map.keySet();
        System.out.println(keys); //[50, 20, 70, 40, 10, 60, 30] all the keys as Set

        //to reach through the key we create a loop
        for (Integer key : keys) {
            System.out.println(map.get(key));//this will take keys one by one and will print the values
        }
        System.out.println("+++++++++++++++++++++++++++++");

        //implementing the same method but with the method, not storing the keys
        for (Integer item : map.keySet()) {
            System.out.println(map.get(item));
        }

        //reach out values using values(); method
        //values();
        //Collection Objects data type
        //Collection includes Set,List,Map

        Collection<String> values = map.values();//return type is Collection Objects
        System.out.println(values);//[Natalie, Vitally, Natalie, Natalie, Alex, Natalie, Tom]

        for (String value : values) {
            System.out.println("--" + value + "--");
            //to reach all the values one at the time to easier manipulate each of the value
        }

        //replace(); method
        map.replace(40, "Andrei"); //we replaced the value on the key40, was "Natalie" now is "Andrei"
        System.out.println(map);
        //also we can put the old value and the new value
        map.replace(70, "Natalie", "Olga");
        //if the typing is not going to mach it won't do any changes

        //map has size
        //size(); method
        System.out.println(map.size()); // will return an Integer number of elements in the Map /7 elements

        //containsKey(); method
        //containsValue(); method
        System.out.println(map.containsKey(96));//false /we don't have this key
        System.out.println(map.containsValue("Igor"));//false / we don't have this value
        System.out.println(map.containsKey(40));//true
        System.out.println(map.containsValue("Andrei"));//true

        System.out.println("++++++++++++++++++++");

        //using the parse(); method
        System.out.println(map.containsKey("10"));//10 as a String,will return false
        System.out.println(map.containsKey(Integer.parseInt("10")));//will convert String key into Integer
        //so it will return true this time
        System.out.println("+++++++++++++++++++++++++");


        //clear(); method
        map.clear(); //we deleted all the elements in the Map
        //System.out.println(map.clear()); //you can not print void methods

        //isEmpty(); method //here we are checking if there are any elements in the map
        System.out.println(map.isEmpty());//true/ because we cleared the Map


    }
}
