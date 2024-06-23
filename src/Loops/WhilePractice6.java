package Loops;

public class WhilePractice6 {
    public static void main(String[] args) {
        /*
        print out every letter from a given String by separating them with a dash
        "Television --> T-e-l-e-v-i-s-i-o-n
         */
        String str = "television";

        int number = 0;
        while ( number <= str.length() - 1){

            if(number == str.length()-1){
                System.out.print( str.charAt(number));

            }else {
                System.out.print( str.charAt(number) + "-");

            }
            number++;

        }



    }
}
