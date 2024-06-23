package stringBasics;

public class StringMethods4 {
    public static void main(String[] args) {
        String season = "Winter";
        //               012345 index for "Winter"
    //substring();--> returns String
        String part = season.substring(1);// result is "inter"
        System.out.println(part);//inter
        String part2 = season.substring(1,4);//result is "int" includes the index 1 but not index 4
        System.out.println(part2);//int

        // System.out.println(season.substring(9));//StringIndexOutOfBoundsException
//                     0123456789 index
        String task = "Welcome to Chicago";
    //take and print out the word 'do' only from above String
        System.out.println(task.substring(5,7));//result is "do"

    //make above task solution dynamic

            int firstSpaceIndex = task.indexOf(' ');
            int secondSpaceIndex = task.indexOf( ' ', firstSpaceIndex + 1);
            String secondWordFromSentence = task.substring(firstSpaceIndex + 1 ,secondSpaceIndex);
        System.out.println(secondWordFromSentence);
        System.out.println( task.substring( task.indexOf(' ') + 1 ,task.indexOf( ' ', firstSpaceIndex + 1)));
    // second System.out.println is if the detailed code if you don't want to store the parameters in "int"




    }
}
