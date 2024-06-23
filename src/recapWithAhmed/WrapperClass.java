package recapWithAhmed;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
          1- What is WRAPPER CLASS?
               -->Wrapper Class it is a process to convert data in to different forms.

          2- How many ways of wrapper classes do you know?
                --> AutoBoxing
                     - It is Converting Data from Primitive to Object.(Happens Automatically)
                --> UnBoxing
                     - It is Converting Data from Object to Primitive.
     NOTE: The reason we use Wrapper Class to make a Conversion data into format that we need.
     (Parsing,Object...)
     */
    public static void main(String[] args) {
        //AUTOBOXING
        int num = 4;//primitive data
        //num. primitive data doesn't have methods
        List<Integer> numbers = new ArrayList<>();

        numbers.add(num); //AUTOBOXING -- added primitive to the List
        numbers.get(0); //automatically happens converting the primitive data in to Object Integer

        //UNBOXING(Parsing)
        //--> Conversion from Object to Primitive.
        String str = "1235";//Object
        int exampleNumber = Integer.parseInt(str); //example -->primitive
        System.out.println(exampleNumber);//1235 as a number

    }
}
