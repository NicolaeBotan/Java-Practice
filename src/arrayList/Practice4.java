package arrayList;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {
        /*
        create an arraylist to store 5 city names
        implement a logic to print only city names that have 6 or more letters
        create a new array list and store the cities then print the array list
         */
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Denver");
        cityList.add("Orem");
        cityList.add("Jackson");
        cityList.add("New York");
        cityList.add("LA");
        System.out.println(cityList);//[Denver, Orem, Jackson, New York, LA]

        //I created a new ArrayList to store the new city names.
        ArrayList<String> newList = new ArrayList<>();

        for (String city : cityList) {
            if (city.length() > 5) {
                newList.add(city);
            }
        }
        System.out.println(newList);//[Denver, Jackson, New York]
        System.out.println("++++++++++++++++++++++++++++");

        //DIFFERENT WAY TO SOLVE THIS TASK
        //we are not storing the new names,just print them

        for (int i = 0; i < cityList.size(); i++) {
            if (cityList.get(i).length() >= 6) {
                System.out.println(cityList.get(i)); //Denver, Jackson, New York
            }
        }

    }
}
