package stringBasics;

public class StringMethods5 {
    public static void main(String[] args) {
        String str = "wednesday";
        String strUpdate = str.replace('e','*');//used char inside but it returns as a String
        System.out.println(strUpdate);// result is w*dn*sday
        String update2 = str.replace("d", "$$");//used string inside and returns as a String
        System.out.println(update2);//result is we$$nes$$ay
        String update3 = str.replace("day", "-");
        System.out.println(update3);//wednes-

        String str2 = "   today is      so quiet   ";
        String result  = str2.trim();//no parameter needed in the parenthesis
        System.out.println(result);//result is "today is      so quiet" i was not able to touch space in
                                   //between the words
        //method chaining (able to use another method after method call)

        int number = str2.trim().replace('t','T').substring(2,8).length(); /*you can use
                                                                    multiple methods in one statement*/
        System.out.println(number);
    //String quote = "   From Zero to HERO   ";
        /*replace 0 with one
        male entire String as upper Case
        remove all spaces
        get a 3 letter substring from  the end and print out what you are left with
         */
        String quote = " Zero to HERO   ";
        String result2 = quote.replace("Zero","one").toUpperCase().trim().replace(" ","" );
        String result3 = result2.substring(result2.length() - 3 );
        System.out.println(result3);




    }
}
