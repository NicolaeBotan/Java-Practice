package Loops;

public class ForPractice2 {
    public static void main(String[] args) {
        //find the sum of numbers between 10 and 15
        //using for loop

        int number = 10, sum = 0;

        for (; number <= 15; number++) {

            sum = sum + number;
        }
        System.out.println("Sum of numbers between 10 and 15 is " + sum);

        //TASK 2
        /*
        String str = "Today is beautiful";
        print out every letter from this given String separated by comma
         */
        String str = "Today is beautiful";

        for (int index = 0; index < str.length(); index++) {

            //  System.out.print(str.charAt(index) +", ");

            if (index == str.length() - 1) {  //this if statement is for the last comma not to be shown
                System.out.print(str.charAt(index));
            } else {
                System.out.print(str.charAt(index) + ", ");
            }
        }
        System.out.println();
        System.out.println("++++++++");


        //print above style without spaces
        //print letters with dash
        str = "Today is beautiful";
        str = str.replace(" ", "");// if you want to replace space with no space
        for (int i = 0; i < str.length(); i++) {

            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));

            } else {
                System.out.print(str.charAt(i) + "-");
            }
        }

            System.out.println();
            System.out.println("++++++++");

            //same Example different solution

            str = "Today is beautiful";

            for (int i = 0; i < str.length(); i++) {

                if (i == str.length() - 1 && str.charAt(i) != ' ') {
                    System.out.print(str.charAt(i));

                } else if(str.charAt(i) != ' '){
                    System.out.print(str.charAt(i) + "-");
                }


            }

        }
    }
