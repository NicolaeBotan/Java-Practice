package Practice;

import java.util.Scanner;

public class stringE {
    public static void main(String[] args) {
        /*
        Return true if the given string contains between 1 and 3 'e' chars.
        stringE("Hello") → true
        stringE("Heelle") → true
        stringE("Heelele") → false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
               count++;
            }
        }
        System.out.println(count >= 1 && count <= 3);
    }
}
