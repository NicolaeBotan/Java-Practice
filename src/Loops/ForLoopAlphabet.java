package Loops;

public class ForLoopAlphabet {
    public static void main(String[] args) {
        //print alphabet as uppercase letters
        //A,B,C,D,...Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {

            if (ch == 'Z') {
                System.out.print(ch);
            } else {
                System.out.print(ch + " - ");
            }
        }

    }
}
