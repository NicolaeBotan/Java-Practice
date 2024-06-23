package recapWithAhmed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

           1- What is the Difference between List and Array?
           --> All the info is in the ArrayRecap.

           2- What is the difference between ArrayList and LinkedList?
               --> List is a part of Collections, and it is used for Storage(Objects).

           ->Array List - It is a way to store Object and access this Object with a specific
                 methods.(GET)
           ->LinkedList - It is a way to store Object and access this Object with a specific
                 methods.(GET)

            --> TO BE HONEST I DO NOT USE LINKED LIST IN MY PROJECT, BUT AS MUCH AS I KNOW THERE IS
            EXECUTION TIME DIFFERENCE FOR ACCESSING THE DATA FROM THE LIST.

           --> The difference between them:
            **--> The reaching out the elements inside the List is more efficient and faster in ArrayList.
           ArrayList<Object> --> arrayList.get(0) ---> 0.02 seconds
           LinkedList<Object> --> linkedList.get(0)---> 0.04 seconds

           **--> When you do any manipulation(changing value,replacing,inserting,removing) at this moment
           LinkedList will be faster.

     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        List list2 = new LinkedList();

        arrayList.add("Hello");
        System.out.println(arrayList.get(0));//Hello

        //THIS IS THE WAY TO ASSIGN VALUE TO THE LIST THE SHORT WAY
        //TO ACCESS EACH ELEMENT IN THE LIST WE USE LOOPS
        List<String> names = Arrays.asList("David", "Deniss", "Joshua", "Nick");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
