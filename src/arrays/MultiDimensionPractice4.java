package arrays;

public class MultiDimensionPractice4 {
    public static void main(String[] args) {

        String[][] menu = {{"steak", "pasta", "fries"}, {"olivie", "cezar"}, {"ice cream", "cake", "candy", "pie"}};

        System.out.println(menu[2][1]);
        String sweet1 = menu[2][1]; //to store the cake value in a separate String
        System.out.println(sweet1);// return "cake"
        System.out.println(menu[0][2]);//fries
        //you visit each element individually.

        //to see them all together individually we use the nested loop

        for (int page = 0; page < menu.length; page++) {

            for (int items = 0; items < menu[page].length; items++) {

                System.out.println(menu[page][items]);

                if (menu[page][items].equalsIgnoreCase("ice cream")) {

                    System.out.println("Kids want to get " + menu[page][items]);
                }

            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        // same task using for-each loop
        //it's a lot easier to use for each loop

        for (String[] page : menu) {

            for (String item : page) {

                System.out.println(item);
            }
        }

    }
}
