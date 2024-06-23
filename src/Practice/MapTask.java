package Practice;

import java.util.HashMap;

public class MapTask {
    public static void main(String[] args) {
        /*
        TASK:
        String[] fruits = {"Apple", "Banana", "Peach", "Apple", "Orange",
                "Strawberry", "Banana", "Apple", "Cherry", "Orange"};
        --> get the output for total each item
            Apple = 3, Banana = 2, Orange = 2, Strawberry = 1, Cherry = 1;
            -Use Map method contains Key
            - Use if condition
        */
        String[] fruits = {"Apple", "Banana","Apple", "Peach", "Apple", "Orange",
                "Strawberry","Cherry", "Banana", "Apple", "Cherry", "Orange"};
        HashMap<String,Integer> map = new HashMap<>();

        for(String str : fruits){
            int count = 1;
            if(map.containsKey(str)){
                map.put(str,map.get(str) + count);
                count++;
            }else {
                map.put(str,count);
            }
        }
        System.out.println(map);
        //{Apple=4, Cherry=1, Strawberry=1, Peach=1, Orange=2, Banana=2}
    }
}
