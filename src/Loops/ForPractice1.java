package Loops;

import java.sql.SQLOutput;

public class ForPractice1 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 5;
        //I want to print all the numbers from 0 to 5

       // while( num1 <= num2 ){
        // System.out.println(num1);
           // num1++;
       // }


        for (   ; num1 <= num2   ; num1++  ){  //Java will compare the condition ,then run the code then it
                                             // will come back to the update statement and compare again
            System.out.println(num1);        //so it will add 1 after it printed ones(at the second round)

        }

        for (int number1 = 10,number2 = 20; number2 >= number1   ; number2-- ){
            //print 20,19,18,...
            System.out.println("Number now is "  +number2);
        }
        System.out.println("++++++++++++++++++++++++++++++++");

        for (int i = 0; i < 10 ;  ){

            System.out.println( i + 1 +" I like for loop ");//we put i + 1 to show the count
            i++;//update statement
            System.out.println(i);//the result is 10, because it will increase with one after the last print
            //you can not print the i variable outside the for statement because belongs to for statement
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        int i = 0;
        for ( ; i < 10 ;  ){

            System.out.println( i + 1 +" I like for loop ");
            i++;
            System.out.println(i);
        }
        System.out.println(i);//result is 10. We took it (i=0) we added until i = 10 then
        // we put it back, that's why i = 10 now outside the "For Loop"

        //another example

        for ( i = 100; i > 90; i--){  //we resigned the value for i from 10 to 100

            System.out.println("Number is " +i );
        }
        System.out.println(i);// result is 90,because it printed then went back to the update statement and
                               // subtracted 1 and made it 90
        //Example
        int a = 0;
        for (  ; a < 5 ; a++){
            System.out.println("Before break time");
            System.out.println(a);//result is 4 because the last condition was true,then a became 5 ,
            //and because the condition was FALSE it just added the 1 to a. but it did print inside the
            // FOR LOOP . a=5 at this time.
        }
        System.out.println(a);// result is 5 because it was added

        //INFINITE LOOP
      //  for ( ; ; ){                 //because there is no condition this code will run forever
       //     System.out.println("after break");
       // }



    }
}
