package Practice;

public class InterviewTask {

    public static boolean isSameLetter(String word) {
        return word.substring(0, 1).equals(word.substring(word.length() - 1));
    }

    public static void main(String[] args) {
        String str = "Afagnistana";
        String str2 = "cars";


        System.out.println(isSameLetter(str.toLowerCase()));//true
        System.out.println(isSameLetter(str2));//false
    }
}
