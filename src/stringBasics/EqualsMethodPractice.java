package stringBasics;

public class EqualsMethodPractice {
    public static void main(String[] args) {

        //equals();
        String name1 = "Dmitriy";//this String was created and shares the same value with name2
        String name2 = "Dmitriy";//same value in String "pool" as name1
        String name3 = new String("Dmitriy"); //this is a new String

        System.out.println(name1.equals(name2));//true
        //==
        System.out.println(name1==name2);//true
        System.out.println(name1.equals(name3));//true 2 Strings created different but with the same value
        System.out.println(name1==name3);//false WHY? because compares the objects.2 Strings created different

        String name4 = new String("Dmitriy");
        System.out.println(name3.equals(name4));//true
        System.out.println(name3 == name4);//false because name4 is a new String with the same value but
                                            // different object
        /* so using == comparing 2 Strings with the same value but created as new String will
        never be equal/the same
        so always for String to compare the data/value is better to use the equals() method
         */
        String name5 = name4;
        System.out.println(name4.equals(name5));//true
        System.out.println(name4 == name5);//true "are the same because they are looking at the same object

        String name6 = name1;
        System.out.println(name6 == name1);//true



    }
}
