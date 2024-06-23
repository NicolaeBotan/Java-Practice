package arrays;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

        String[] studentsNames = new String[9];

        studentsNames[0] = "Alex";
        studentsNames[1] = "Ana";
        studentsNames[2] = "Dilyana";
        studentsNames[3] = "A O";
        studentsNames[4] = "Stan";
        studentsNames[5] = "Diana";

        System.out.println(Arrays.toString(studentsNames));

        //print out the name if the name has letter 'l' into it

        for (int i = 0; i < studentsNames.length; i++) {

            if (studentsNames[i] == null) {
                continue;
            }

            if (studentsNames[i].contains("l")) {
                System.out.println(studentsNames[i]);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++");

        for (int i = 0; i < studentsNames.length; i++) {

            if (studentsNames[i] != null) {  //this was done for not showing the null options

                if (studentsNames[i].contains("l")) {
                    System.out.println(studentsNames[i]);
                }
            }
        }
    }
}
