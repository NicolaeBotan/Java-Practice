package arrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();//one way to create an ArrayList
        ArrayList list2 = new ArrayList(5);
        ArrayList list3 = new ArrayList(list1);//here I put all the list1 into the list3

        ArrayList<String> list = new ArrayList<>();//common way we are creating ArrayList
        System.out.println(list);//nothing

        //add(); add() an element to a specific index; get();

        list.add("tomatoes");//we use the 'add' method to add this value to the ArrayList
        System.out.println(list);
        list.add("potatoes");
        list.add("cucumbers");
        list.add("cherries");
        list.add("lettuce");
        System.out.println(list);//[tomatoes, potatoes, cucumbers, cherries, lettuce] insertion order

        System.out.println(list.get(4));//we are getting the value with index 4 --> lettuce
        //Data type that is returning is String, so we can store it as a String

        String item = list.get(3);
        System.out.println(item);//cherries

        //adding a value to the ArrayList using a different method, using 2 parameters
        list.add(3, "bananas");// first goes the index number and then the value
        System.out.println(list);//[tomatoes, potatoes, cucumbers, bananas, cherries, lettuce]
        //this "add" method is not replacing the element with the specific index, but is adding an
        //element and pushes backwards the existing element with that index position

        //let's try to add a value to a bigger index number
        // list.add(9,"apples");//IndexOutOfBoundsException

        list.add(6, "apples");//it will add to the last index position
        System.out.println(list);//[tomatoes, potatoes, cucumbers, bananas, cherries, lettuce, apples]

        //how to check how many elements are in ArrayList
        //size() method

        int size = list.size();// to see the size of the ArrayList
        System.out.println(size);// 7 elements

        //REPLACING AN ELEMENT
        // set() method
        list.set(4, "dressing");// we replace "cherries" with "dressing"
        System.out.println(list);//[tomatoes, potatoes, cucumbers, bananas, dressing, lettuce, apples]

        //REMOVING AN ELEMENT
        //remove() method
        list.remove(4);//you pass the index position of the element that you want to remove
        System.out.println(list);//[tomatoes, potatoes, cucumbers, bananas, lettuce, apples]
        System.out.println(list.size());//6 elements

        list.remove("bananas");// to remove just type the element/object
        System.out.println(list);//[tomatoes, potatoes, cucumbers, lettuce, apples]

        //DELETE ALL ELEMENTS
        //clear() method
        list.clear();
        System.out.println(list);//return is [ ] empty ArrayList, no elements anymore

        //Let's create a new ArrayList

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("bread");
        list5.add("cheese");
        list5.add("mayo");

        //assigning the list5 to the empty list
        list.addAll(list5);
        System.out.println(list);//[bread, cheese, mayo]
        list.add("grape");
        System.out.println(list);//[bread, cheese, mayo, grape]

    }
}
