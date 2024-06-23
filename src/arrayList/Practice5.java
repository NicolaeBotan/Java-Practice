package arrayList;

import object.Bottle;

import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {
        /*
        Create an ArrayList
        Store bottle Objects
        manipulate elements from the arraylist
         */
        ArrayList<Bottle> list = new ArrayList<>();//data type is Bottle
        //we should create some bottles to be able to store them in the ArrayList

        Bottle b1 = new Bottle(6);
        Bottle b2 = new Bottle(16);
        Bottle b3 = new Bottle(26);

        //we add the bottles into the ArrayList
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //lest see the arraylist
        System.out.println(list);
        /*
        [Size: 6.0 isClean: true liquidAmount: 0.0,
         Size: 16.0 isClean: true liquidAmount: 0.0, Size: 26.0 isClean: true liquidAmount: 0.0]
        */ //we see here the return from Bottle class, because we created the bottle Object from that class

        System.out.println(list.get(0).size);//6.0
        System.out.println(list.get(1).liquidAmount);//0.0

        //compare and find the difference between the b1 size and b2 size
        System.out.println((list.get(1).size) - (list.get(0).size));// 16-6= return is 10.0

        //check the list and see
        //if any bottles size is more than 10 , print that the bottle "is large bottle"

        for (Bottle item : list) {
            if (item.size > 10) {
                System.out.println("It is a large bottle =>" + item.size);
            }

        }

    }
}
