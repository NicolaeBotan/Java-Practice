package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        //ask user how many chocolates names he/she wants to store in an array
        //get the names of the chocolates from user
        //store them into an array
        //print stored elements back to the user
        //lindor,milka,twix,ferrero,snickers,m&m,...
        //if the name is 5 letters or less,store into shortNames Array
        //otherwise store into longNames Array

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chocolate names you want to store?");
        int volume = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[volume];
        String[] shortN = new String[volume];
        String[] longN = new String[volume];

        for (int i = 0; i < volume; i++) {
            System.out.println("Type in the chocolate name " + (i + 1));
            String str = scanner.nextLine();
            names[i] = str;
            if (str.length() > 5) {
                longN[i] = str;
            } else {
                shortN[i] = str;
            }
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(longN));
        System.out.println(Arrays.toString(shortN));
        
    }
}
