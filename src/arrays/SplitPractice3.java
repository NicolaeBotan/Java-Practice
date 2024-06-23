package arrays;

import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {

        String str = "Sunday is daddy day";

        String[] parts = str.split("d");
        System.out.println(Arrays.toString(parts));

        String[] parts2 = str.split("d", 3);//this is done for splitting only in 3 elements
        System.out.println(Arrays.toString(parts2));//return --> [Sun, ay is , addy day]

        // Example
        // 12-23-2022
        // 12/23/2022
        // 12.23.2022
        // 23-12-2022
        //check if the day is 23 then print out "Happy Birthday"

        String date1 = "12-23-2022";
        String[] date2 = date1.split("-");
        System.out.println(Arrays.toString(date2));//[12, 23, 2022]

        if (date2[0].equals("12") && date2[1].equals("23")) {
            System.out.println("Happy Birthday"); //index1 is 23, so it will print "happy birthday"
        } else {
            System.out.println("Its not your Birthday");
        }
        //different format of date
        //12.23.2022

        String format = "12.23.2022";
        String[] format1 = format.split("\\.");// this \\ shows java to take the "." as reference
        System.out.println(Arrays.toString(format1));//returns [12, 23, 2022]

    }
}
