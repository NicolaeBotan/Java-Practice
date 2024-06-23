package Loops;

import java.util.Scanner;

public class PatternPractice {
    public static void main(String[] args) {
        /*
        using a scanner ,ask user for length and width of the pattern
        output
        3 and 3
        ###
        ###
        ###
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the pattern");
        int length = scanner.nextInt();
        System.out.println("Enter the width of the pattern");
        int width = scanner.nextInt();


        for (int i = 0; i < length; i++) {

            for (int w = 0; w < width; w++) {

                System.out.print("#");
            }
            System.out.println();
        }
    }
}
