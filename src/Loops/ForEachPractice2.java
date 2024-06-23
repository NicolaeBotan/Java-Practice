package Loops;

import java.util.Arrays;

public class ForEachPractice2 {
    public static void main(String[] args) {

        String[] flowers = {"rose", "daisy", "sunflower" };
        //print them all upperCase
        for (String flowerName : flowers) {

            System.out.println(flowerName.toUpperCase());
        }
        //TASK

        String[] cities = {"Chicago", "Miami", "Tokyo", "Doha", "Denver", "New York" };

        //chicago@gmail.com
        // put those email addresses in another storage for future reference
        String[] cityEmails = new String[cities.length];
        int i = 0;
        for (String city : cities) {
            cityEmails[i] = city.toLowerCase().replace(" ", "").concat("@gmail.com");
            i++;
        }
        System.out.println(Arrays.toString(cityEmails));//return is
//[chicago@gmail.com, miami@gmail.com, tokyo@gmail.com, doha@gmail.com, denver@gmail.com, newyork@gmail.com]

    }
}
