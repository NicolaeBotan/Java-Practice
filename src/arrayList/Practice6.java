package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {
        //Every ArrayList in a List
        // but not every List is an ArrayList
        // List is father and ArrayList is the child

        List list1 = new ArrayList<>();
        //List<String> list1 = new ArrayList<>();
        //you can type it this way too, if you want to specify the datatype for the Object
        list1.add("IL");
        list1.add("OH");
        System.out.println(list1.get(1));//OH

        //convert from Array to ArrayList
        int[] digits = {3, 4, 5, 6};
        List<int[]> a = Arrays.asList(digits);

        // a.add(12); //UnsupportedOperationException
        System.out.println(a);
        System.out.println(Arrays.toString(a.get(0)));//[3, 4, 5, 6]
        System.out.println(a.get(0)[0]);//3

        //this means index 0 from the ArrayList,that is the only element, than next 0 is the index
        //of the values in that element

        //convert ArrayList to Array
        ArrayList items = new ArrayList();
        items.add("Alex");
        items.add("Ana");

        Object[] array = items.toArray();//this will convert ArrayList to Array
        //this return should always be Object type

        System.out.println(Arrays.toString(array));//[Alex, Ana]

        //reassign the value of the index 1
        array[1] = "Vitally";
        System.out.println(Arrays.toString(array));//[Alex, Vitally]

        System.out.println(array[0]);//Alex


    }
}
