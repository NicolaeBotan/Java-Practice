package recapWithAhmed;

public class MultiDimensionalArray {
    /*
    There is no specific question regarding that other than Difference between Array and ArrayList.
          --> In Automation we will have more examples how use.

     */
    public static void main(String[] args) {
        String[][] names = {{"Ahmet"}, {"Mehmet"}, {"Mahmut"}, {"Ahmet", "Mehmet", "Mahmut"}};

        //in the parenthesis are going the index numbers
        System.out.println(names[3][2]);//Mahmut
        System.out.println(names[0][0]);//Ahmet
        System.out.println(names[1][0]);//Mehmet
        //System.out.println(names[0][3]);//Exception ArrayIndexOutOfBoundsException
        
    }
}
