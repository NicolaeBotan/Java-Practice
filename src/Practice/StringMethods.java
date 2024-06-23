package Practice;

public class StringMethods {
    public static void main(String[] args) {
        String school = "Techtorial";
        school = school.toUpperCase();
        System.out.println(school);//all upper case --> TECHTORIAL

        school = school.toLowerCase();
        System.out.println(school);//"techtorial"

        System.out.println(school.startsWith("tech"));// ---> startsWith METHOD
        boolean correct = school.endsWith("al");//   --> endsWith METHOD
        boolean correct1 = school.endsWith("k");

        System.out.println(correct);//true
        System.out.println(correct1);//false
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        String school1 = new String("Techtorial");
        System.out.println(school1.contains("torial"));//true -->CONTAINS METHOD
        System.out.println(school1.contains("key"));//false

        boolean result = school1.equals("Techtorial");// we compare school1 with word "Techtorial"
        System.out.println(result);//true

        System.out.println(school1.equals("torial"));//false because they are not the same

        boolean result2 = school1.equalsIgnoreCase("TECHTORIAL");
        System.out.println(result2);// true because compares both Strings ignoring case
        // IGNORE CASE METHOD

        // SUBSTRING METHOD
        String str = school1.substring(3); //starting with index 3 inclusive
        System.out.println(str);//result is "htorial" because we got the String starting with index 3

        String str1 = school1.substring(2,5);//will give back a String starting with index 2 but without
        System.out.println(str1);            //  index 5 --> result is "cht"

        System.out.println(school1);// String "school1" remained unchanged because is IMMUTABLE unless you
                                    // reassign the value or create a new String







    }
}
