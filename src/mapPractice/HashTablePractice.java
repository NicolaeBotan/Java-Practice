package mapPractice;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable<>();

        table.put("Rose", 3);
        table.put("Daisy", 5);
        table.put("SunFlower", 10);
        table.put("Tulip", 9);
        System.out.println(table);

        System.out.println(table.get("Tulip"));//9

        System.out.println(table.values());//[10, 5, 9, 3]
        System.out.println(table.keySet());//[SunFlower, Daisy, Tulip, Rose]
        System.out.println(table.entrySet());//[SunFlower=10, Daisy=5, Tulip=9, Rose=3]
        //the entrySet returns as a Set

        //table.put(null,18);//NullPointerException--> HashTable does not allow null keys
        //table.put("Orchird",null);//NullPointerException-->HashTable does not allow null values

    }

}
