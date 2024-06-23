package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice2 {
    public static void main(String[] args) {

        String[][] citiesFromStates = {{"Los Angeles", "Sacramento"}, {"Chicago", "Springfield", "Des Plaines"},
                {"Baltimore", "Rockville"}};

        // use for each loop to show names of cities
        // when you find Chicago --> say "chicago is in IL"

        for (String[] state : citiesFromStates) {

            //System.out.println(Arrays.toString(state));
            for (String city : state) {

                if (city.equalsIgnoreCase("chicago")) {
                    System.out.println(city + " Is in IL");

                } else {
                    System.out.println(city);
                }

            }
        }

    }
}
