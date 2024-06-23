package Loops;

public class ForPractice3 {
    public static void main(String[] args) {
        String str = "It is a cloudy day in Chicago";

        //print out --> "I found a lower case 'c'"
        // when you see a lower case 'c'
        //count how many 'c' are in the string


        for (int index = 0, count = 0; index < str.length(); index++) {

            if (str.charAt(index) == 'c') { //index is dynamically changing checking every index of the String
                count++;
                System.out.println("I found a lower case 'c'");
            }
            if (index == str.length() - 1) {   //this condition will be true ones at the end so then will print
                System.out.println("I found " + count + " lower case 'c'");
                //so the second IF Condition was created only for keeping everything inside the loop
                // so, it will print the count at the end when the index will be the length - 1;
            }

            //TASK print out "i" from the String

            if (str.charAt(index) == 'i') {
                System.out.println(str.charAt(index));
            }

        }
    }
}
