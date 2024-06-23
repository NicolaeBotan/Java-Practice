package stringBuilder;

public class Practice1 {

    //create a program to print uppercase Alphabet as a single string

    public String alphabet() {
        String alphabet1 = "";

        for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
            alphabet1 += ch1;

        }

        return alphabet1;
    }

    public static void main(String[] args) {

        Practice1 practise = new Practice1();
        practise.alphabet();//to call the method

        String str = practise.alphabet();
        System.out.println(str);
        System.out.println(str.charAt(5));

        //create a StringBuilder

        StringBuilder builder = new StringBuilder("Sunny");//you can assign value also when you create the cons
        System.out.println(builder);//Sunny

        StringBuilder builder1 = new StringBuilder();
        builder1.append("Winter");
        System.out.println(builder1);//Winter

        builder1.append(" is not having snow for this year");
        System.out.println(builder1);//it will attach and assign it back
        //Winter is not having snow for this year

        builder1 = builder1.append(" is not having snow for this year");
        System.out.println(builder1);//Winter is not having snow for this year is not having snow for this year
        //this method will attach to the existing String

        //use StringBuilder Object to print lowercase alphabet
        StringBuilder lowerCase = new StringBuilder();
        for (char ch2 = 'a'; ch2 <= 'z'; ch2++) {
            lowerCase.append(ch2);
        }
        System.out.println(lowerCase);//abcdefghijklmnopqrstuvwxyz

    }
}
