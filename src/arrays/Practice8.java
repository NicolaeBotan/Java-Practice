package arrays;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {

        String[] brand = {"Nike", "Adidas", "Puma", "New Balance", "Rebook"};

        //print every brand name in reverse version
        //ekiN,sadidA,...
        String[] reversedArray = new String[brand.length];
        for (int i = 0; i < brand.length; i++) {  //i -->is the index of each element

            //System.out.println(brand[i]);// String str = "Nike";...
            String reversed = "";
            for (int k = brand[i].length() - 1; k >= 0; k--) { //k --> index of each brand
                reversed += brand[i].charAt(k);// this is done for storing each brand in reversed direction
            }
            reversedArray[i] = reversed; //to store the reversed in a new array

            System.out.println("Reversed : " + brand[i] + " >> " + reversed);//to show each of them separate
        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
