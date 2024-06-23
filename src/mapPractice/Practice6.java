package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice6 {
    public static void main(String[] args) {

        HashMap<String, Integer> departments = new HashMap<>();
        departments.put("IT", 204);
        departments.put("HR", 305);
        departments.put("ADMIN", 102);

        //keySet()--> returns all keys as Set
        //values()--> returns all values as Collection
        System.out.println(departments.keySet());//[HR, IT, ADMIN]
        System.out.println(departments.values());//[305, 204, 102]

        System.out.println(departments); //{HR=305, IT=204, ADMIN=102}

        //entrySet() method --> will return keys and values as pair
        System.out.println(departments.entrySet());//[HR=305, IT=204, ADMIN=102]

        //RETURN TYPE IS MAP.ENTRY
        Set<Map.Entry<String, Integer>> pairs = departments.entrySet();

        //reach out key-value pairs individually
        for (Map.Entry<String, Integer> pair : pairs) {
            System.out.println(pair);
            //printing the key
            //print the value
            System.out.println("---key--" + pair.getKey());
            System.out.println("--value--" + pair.getValue());
        }

    }
}
