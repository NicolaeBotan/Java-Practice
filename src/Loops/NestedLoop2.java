package Loops;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*
        print out hours and minutes as follows
        for the hours from 1 to 12
        minutes from 0 to 59
        Print:
        hour - 1 : min - 0 : sec - 0
        hour - 1 : min - 1
        hour - 1 : min - 2
        ...
        hour - 2 : min 0
        hour - 2 : min 1
        ...
        6 hours AM
        6 hours PM
        //make sure each hour is 30 minutes
         */

        for (int h = 1; h <= 12; h++) {


            for (int m = 0; m <= 59; m++) {

                if( m == 31){ //we used this break statement to break the loop at minute 30
                    break;
                }

                for (int s = 0; s <= 59; s++) {

                    if (h <= 6) {
                        System.out.println("hour - " + h + " : min " + m + " : sec - " + s + " AM");
                    } else {
                        System.out.println("hour - " + h + " : min " + m + " : sec - " + s + " PM");
                    }

                }
            }
            System.out.println("Hour change======================================================");
        }

    }
}
