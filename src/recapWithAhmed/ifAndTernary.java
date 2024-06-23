package recapWithAhmed;

import java.util.Scanner;

public class ifAndTernary {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
             1- Most of the technical questions require if Condition.

             If is a Conditional Statement.
             if(condition){
             implementation
             }else{
             Implementation
              }
     */
    public static void main(String[] args) {
        /*
        temp are -10 to 0 is freezing.
        temp are 0 to 5 is normal.
        temp are 25 to 50 is hot.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature?");
        int actualTemp = scanner.nextInt();

        if(actualTemp < 0 && actualTemp > -10){
            System.out.println("It is super Cold");
        }else if(actualTemp < 25 && actualTemp > 0){
            System.out.println("It is Normal");
        }else if(actualTemp < 50 && actualTemp > 25){
            System.out.println("It is Hot");
        }else{
            System.out.println("The input is not applied for the condition please check");
        }
        // || condition
        boolean result = actualTemp > 10 || actualTemp < 5;
        System.out.println(result);

        //TERNARY OPERATORS:   CONDITION ? VALUE1 : VALUE2;
        //Is better to use Ternary Operators instead of If statement
        //if the condition: is true ---> VALUE1
        //                  is false --> VALUE2

        String name = "Ahmet";
        String name2 = "ahmet";
        String result2 = name.equalsIgnoreCase(name2) ? "Values are Matching" : "Values are Not Matching";
        System.out.println(result2);//"Values are Matching"


    }
}
