package recapWithAhmed;

import java.util.Scanner;

public class SwitchStatement {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
           1- Some of the technical questions might need switch instead of if Statement to
           show off yourself that you actually know how to implement switch as well.

           --> If you have limited number of options and not change it usually.
           It's good to use switch instead of if condition to make it look more professional.

           SWITCH(Value/Reference) --> int number = 5;
              case : dataType;
              break;
              case2 : dataType2;
              break;

     */
    public static void main(String[] args) {
        System.out.println("Please enter a number in the range 1 - 3 ");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        switch (options) {
            case 1:
                System.out.println("You are talking to HR");
                break;
            case 2:
                System.out.println("You are talking to IT");
                break;
            case 3:
                System.out.println("You are talking to HEALTH DEPARTMENT");
                break;
            default:
                System.out.println("Your input is not on the Range 1-3");
                break;
        }

    }
}
