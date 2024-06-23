package arrayList;

import object.Bottle; //this class is imported from object package
import object.Cat;//this class is imported from object package
import object.Flower;//this class is imported from object package

import java.util.ArrayList;//this class is imported from java.util package

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<Integer> zipCodes = new ArrayList<>();
        zipCodes.add(540);
        zipCodes.add(600);
        zipCodes.add(404);
        zipCodes.add(202);
        System.out.println(zipCodes);//[540, 600, 404, 202]

        for (Integer code : zipCodes) {
            System.out.println(code + 10);//we can do any arithmetical operation
        }
        System.out.println("++++++++++++++");

        //creating a for loop with Object data type
        //Object data type is bigger that Integer, so it's possible

        for (Object code : zipCodes) {
            System.out.println(code);//in this case you can not do most of the arithmetical operations
        }
        System.out.println("===========================");

        //creating a non datatype specified ArrayList

        ArrayList list1 = new ArrayList();//Object data type so you can include as a value any datatype
        // mixed data type
        //because ArrayList data type is Object you can store different kinds of data
        list1.add("Diana");
        list1.add(123);
        list1.add(true);

        System.out.println(list1.get(0).toString().toUpperCase());//DIANA
        System.out.println(list1.get(1).toString().equals("123"));//true
        //we do this to convert from Object type to String type,to be able to use all the String methods
        //to any of these values

        System.out.println("_______________");

        //contains
        System.out.println(zipCodes.contains(540));//true
        System.out.println(zipCodes.contains(100));//false

        boolean b = zipCodes.isEmpty(); //this method verifies if the ArrayList is empty or not
        System.out.println(b);//false because is not empty

        list1.clear();
        System.out.println(list1.isEmpty());//true because we cleared it

        //implementing the "generate" method
        System.out.println(generate(zipCodes));//[Hi540, Hi600, Hi404, Hi202]
        ArrayList<String> name = generate(zipCodes);
        System.out.println(name);//[Hi540, Hi600, Hi404, Hi202]

        //creating an ArrayList with no diamond brackets so that means i can store any type of Objects

        ArrayList mixedTypes = new ArrayList();
        mixedTypes.add(8);
        mixedTypes.add("Test");
        mixedTypes.add(true);
        mixedTypes.add('r');
        mixedTypes.add(5.6);

        Cat cat = new Cat();//data type of the cat is cat
        //we created a 'cat' Object from Cat class, so we can add that cat object into our ArrayList
        mixedTypes.add(cat);//adding the "cat Object" in our ArrayList

        Flower flower = new Flower();
        mixedTypes.add(flower);

        System.out.println(mixedTypes);//[8, Test, true, r, 5.6, object.Cat@723279cf, object.Flower@10f87f48]
        // last 2 are showing hashcode, the locating in the memory of the Object

        Bottle bottle = new Bottle(4);
        mixedTypes.add(bottle);
        System.out.println(mixedTypes);
        //[8, Test, true, r, 5.6, object.Cat@723279cf, object.Flower@10f87f48,
        // Size: 4.0 isClean: true liquidAmount: 0.0]

        //for each value from this ArrayList you can do manipulations of its own data type
        // 8 is Integer type, so you can do Integer manipulations
        // Test is String type, so you can apply any String methods to it
        //...


    }
    //create a method that will take an ArrayList as parameter
    //it will generate message for each item from the list
    //it will store and return those messages as an ArrayList

    public static ArrayList<String> generate(ArrayList<Integer> newList) {
        ArrayList<String> message = new ArrayList<>();

        for (Integer number : newList) {
            message.add("Hi" + number);

        }
        return message;

    }


}
