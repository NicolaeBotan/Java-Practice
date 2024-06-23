package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice3 {
    public static void main(String[] args) {
        //Comparing 3 different types of Map
        //HashMap, LinkedHashMap, TreeMap

        HashMap<String, Integer> hash = new HashMap<>();
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();
        TreeMap<String, Integer> tree = new TreeMap<>();

        hash.put("pepsi", 2);       linked.put("pepsi",2);       tree.put("pepsi",2);
        hash.put("coke", 5);        linked.put("coke",5);        tree.put("coke",5);
        hash.put("tea", 4);         linked.put("tea",4);         tree.put("tea",4);
        hash.put("lemonade", 6);    linked.put("lemonade",6);    tree.put("lemonade",6);
        hash.put("water", 8);       linked.put("water",8);       tree.put("water",8);

        //the storing order depends on the keys
        System.out.println(hash); //{tea=4, pepsi=2, coke=5, lemonade=6, water=8} //no order
        System.out.println(linked); //{pepsi=2, coke=5, tea=4, lemonade=6, water=8} //insertion order
        System.out.println(tree); //{coke=5, lemonade=6, pepsi=2, tea=4, water=8} //ascending order

        //null keys
        //tree is not accepting null as a key
        hash.put(null,11);            linked.put(null,11);         //tree.put(null,11);no null key accepting

        System.out.println(hash);//{null=11, tea=4, pepsi=2, coke=5, lemonade=6, water=8}
        System.out.println(linked);//{pepsi=2, coke=5, tea=4, lemonade=6, water=8, null=11}
        System.out.println(tree);//{coke=5, lemonade=6, pepsi=2, tea=4, water=8}

        //null values
        //null value duplicate is accepted,so ypu can store multiple null values
        //tree is accepting null only as a value
        hash.put("coffee",null);     linked.put("coffee",null);    tree.put("coffee",null);

        System.out.println(hash);//{pepsi=2, coke=5, tea=4, lemonade=6, water=8, null=11, coffee=null}
        System.out.println(linked);//{pepsi=2, coke=5, tea=4, lemonade=6, water=8, null=11, coffee=null}
        System.out.println(tree);//{coffee=null, coke=5, lemonade=6, pepsi=2, tea=4, water=8}


    }
}
