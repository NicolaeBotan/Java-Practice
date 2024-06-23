package stringBasics;

public class StringMethods3 {
    public static void main(String[] args) {

        String str = "water";
    //startsWith(); result is boolean
        boolean result1 = str.startsWith("w");//true
        System.out.println(result1);
        System.out.println(str.startsWith("water"));//true
        System.out.println( str.startsWith("ter"));//false
    //endsWith(); result is boolean
        System.out.println( str.endsWith("r")); //true
        System.out.println( str.endsWith("abc"));//false













    }
}
