package object;

public class MethodPractice3 {
    //create a method that will take an array with some names of veggies
    //this method will generate a message for each veggie as
    //"this is my least favorite"
    //if the veggie name has word green into it "this is my most favorite "
    //return count of either favorite or non-favorite veggie amount
    //make the method static
    //test your method in another class

    public static int veggieFilter(String[] veggies) {
        int counter = 0;
        for (String name : veggies) {
            name = name.toLowerCase();
            if (name.contains("green")) {
                counter++;
                System.out.println(counter + " This is my most favorite");

            } else {

                System.out.println(" This is my least favorite");
            }
        }
        return counter;
    }
    // overload the above method to create email address for each of them
    //return those created addresses as an array

    public static String[] veggieFilter(String[] veggies, int number) {
        String[] emails = new String[veggies.length];
        int i = 0;
        for (String name : veggies) {
            String email = name + "@gmail.com";
            emails[i] = email;
            i++;
        }
        return emails;
    }

}
