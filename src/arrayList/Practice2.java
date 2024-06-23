package arrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        //create an ArrayList and store 6 car brands
        //print out brand of every car from the list
        //print every brand@gmail.com

        ArrayList<String> brands = new ArrayList<>();

        brands.add("Mercedes");//assigning value to the ArrayList
        brands.add("BMW");//assigning value to the ArrayList
        brands.add("Datsun");//assigning value to the ArrayList
        brands.add("Jeep");//assigning value to the ArrayList
        brands.add("Ferrari");//assigning value to the ArrayList
        brands.add("Maclaren");//assigning value to the ArrayList

        System.out.println(brands);//[Mercedes, BMW, Datsun, Jeep, Ferrari, Maclaren]

        for (String email : brands) {
            System.out.println(email + "@gmail.com");
            /*
            Mercedes@gmail.com
            BMW@gmail.com
            Datsun@gmail.com
            Jeep@gmail.com
            Ferrari@gmail.com
            Maclaren@gmail.com
             */
        }
        //solving the task different way
        //using method indexOf with the "for loop"

        for (int i = 0; i < brands.size(); i++) {
            System.out.println(brands.get(i) + "@yahoo.com");
        }
        //create a method that will take an ArrayList as parameter.
        //parameter arrayList should hold String type elements
        //that method will show ony elements that have letter 'a' in it

        filter(brands);//Datsun,Ferrari,Maclaren //implementing the 'filter' method
    }

    public static void filter(ArrayList<String> letter) {

        for (int i = 0; i < letter.size(); i++) {

            if (letter.get(i).contains("a")) {
                System.out.println(letter.get(i));
            }

        }

    }
}
