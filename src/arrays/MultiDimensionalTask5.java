package arrays;

public class MultiDimensionalTask5 {
    public static void main(String[] args) {
        /*
        ---Computers----
        Apple -->2500
        Dell -->1800
        Acer--> 1300
        Samsung--> 1100.99

        ----TV----
        LG   -->1100
        Sony  --> 800
        Toshiba --> 599

          ---Speakers---
        google --> 99.99
        bose  --> 120.99
        JBL  --> 89.99
        //Output --->JBL is 89.99
         */
        //Task:
        //customer wants to see all "Google" products witch are less than $100

        String[][] brands = {{"Apple", "Dell","google","Acer", "Samsung"}, {"LG", "Sonny", "Toshiba"}, {"Google", "Bose", "JBL"}};
        double[][] price = {{2500, 1800, 400, 1300, 1100.99}, {1100, 800, 599}, {99.99, 120.99, 89.99}};

        for (int i = 0; i < brands.length; i++) {  //we find the positions in the first Array

            for (int k = 0; k < brands[i].length; k++) { //we find each element in the other array

                if ( brands[i][k].equalsIgnoreCase("google") && price[i][k] < 100){
                    //to show the Google products that are lees then $100

                    System.out.println(brands[i][k] + " is the item from google $" + price[i][k]);
                    //to show the Google products that are lees then $100
                }

                //System.out.println(brands[i][k] + " is $" + price[i][k]);
            }
        }

    }
}
