package recapWithAhmed;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
         1- How can you make the element unique with Collection?(American Style)
         1- What is "Set"? What is the purpose of using it? (Indian Style)
    ANSWER: --> In my Project I was using Set to make the elements "UNIQUE" to prevent duplication
            which causes some technical and business issues.
            --> It is a way to store the unique elements only.

         2- Can you tell me types of Collections?
    ANSWER: --> As much as I know since it has been a long time I used one of them :
                    1-- We have List that has ArrayList and LinkedList.
                    2-- We have Set that has HashSet, LinkedHashSet and TreeSet.

        --HashSet -->       RANDOMLY STORE UNIQUE ELEMENTS.
        --LinkedHashSet --> INSERTION ORDER.
        --TreeSet -->       ASCENDING ORDER.
                   **QUEUE is another type of Collection, but we are not really using it.

         3- Can you explain the difference between Set and List?
    ANSWER:
    -->  SET ==> 1- Only unique elements.
                 2- It has different Sub-Types (HashSet,LinkedSet,TreeSet)
             *** 3- There is no INDEXING IN SET.

    -->  LIST ==> 1- It can store duplicate elements.
                  2- We have only two types (ArrayList and LinkedList)
                  3- It works mostly with indexing.
     */
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbers2 = new LinkedHashSet<>();
        Set<Integer> numbers3 = new TreeSet<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);
        //NO DUPLICATE ELEMENTS IN SET
        System.out.println(numbers);//[1, 3, 5] will assign RANDOMLY

        numbers2.add(1);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(3);
        //NO DUPLICATE ELEMENTS IN SET
        System.out.println(numbers2);//[1, 5, 3] will assign INSERTION ORDER

        numbers3.add(1);
        numbers3.add(4);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(2);
        //NO DUPLICATE ELEMENTS IN SET
        System.out.println(numbers3);//[1, 2, 3, 4, 5] It will assign in ASCENDING ORDER

    }
}
