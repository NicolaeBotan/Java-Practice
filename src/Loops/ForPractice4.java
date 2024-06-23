package Loops;

public class ForPractice4 {
    public static void main(String[] args) {
        //print alphabet as uppercase letters
        //A,B,C,D,...Z

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            if (ch == 'Z') {
                System.out.println(ch);
            } else {
                System.out.print(ch + "*");
            }
        }
        System.out.println("+++++++++++++++++++++++");

        //print out all the digits separating them with '$'

        for (char ch = '0'; ch <= '9'; ch++) {
            if (ch == '9') {
                System.out.println(ch);
            } else {
                System.out.print(ch + "-$-");
            }

        }
    }
}
