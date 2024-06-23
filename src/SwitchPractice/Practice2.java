package SwitchPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        get an int from user
        if the number is 1 --> "It is IT Department"
        if number is 2 --> "It is HR Department"
        if number is 3 --> "It is Help Desk"
        4--> "It is Accounting"
        cover for invalid choices
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from 1 to 4 please");
        int input = scanner.nextInt();
         switch (input){

             case 1 :
                 System.out.println("It is IT Department");
                 break;
             case 2 :
                 System.out.println("It is HR Department");
                 break;
             case 3 :
                 System.out.println("It is Help Desk");
                 break;
             case 4 :
                 System.out.println("It is Accounting");
                 break;
             default :
                 System.out.println("No valid number");

         }

    }
}
