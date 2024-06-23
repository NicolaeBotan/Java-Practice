package stringBasics;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "phone";
        System.out.println( str.charAt(4) );// result is "e"

        //System.out.println( str.charAt(5) ); // Run Time Error //StringIndexOutOfBoundsException
        //because index 5 doesnt exist in string str = "phone";

        //System.out.println( str.charAt( - 3) );//StringIndexOutOfBoundsException (because negative index)
        // index always starts from 0

        //System.out.println( str.charAt( str.length() ) ); //StringIndexOutOfBoundsException
        // because str.length() is 5 and str.charAt(5) its error
        System.out.println( str.charAt( str.length() - 2 ) );//will work because 5-2=3 and result is "n"

        str = "phone";
        //indexOf();
        System.out.println( str.indexOf('p') );// result is 0 because "p" index is 0 (p is a char)
        System.out.println( str.indexOf( "p" ) );// p is as text here it will also return 0
        System.out.println( str.indexOf( "ph") );//0--> if given chars will match within the string
                                                 //in the same order sequence ,it will return
                                                 // first matching char's index number
        System.out.println( str.indexOf( "ne" ) );//result is 3 (because index is only one number)
        System.out.println( str.indexOf( "nE" ) );// will return -1 because we don't have matching "nE"

        str = "new York";
        // I want to find index number of the space
        System.out.println( str.indexOf(' ') );// result is 3 (you put space in single '')

        str = "mama";
        //find index of second 'a';
        System.out.println( str.indexOf('a') );// 1
        System.out.println( str.indexOf( 'a', 2 ) );//we tell Java to start looking from2
                                                                // next from index position 1 so (first a)

        str = "happy evening to you";
        System.out.println( str.indexOf('y') );//4
        //find index of second 'y'
        System.out.println(str.indexOf( 'y', 5) );//result 17 (so 4 position of 1st 'y' + 1 (5)

        //how to pass index 5 above by dynamically?
        int indexOfSecondY = str.indexOf('y', str.indexOf('y') + 1);
        System.out.println(indexOfSecondY);// result 17 (it will find by itself)

        String word = "Java is getting easy :)";
        //find the second space's index number

        int indexOfSecondSpace = word.indexOf( ' ', word.indexOf(' ') +1);// result is 7
        System.out.println(indexOfSecondSpace);//result will show 7
        System.out.println(word.indexOf("easy :)"));// it will show index of 'e' //16

        String text = "DO whatever it Takes";
        System.out.println( text.toLowerCase());//result is 'do whatever it takes'
        System.out.println( text.toUpperCase());// result is 'DO WHATEVER IT TAKES'
        System.out.println(text);// "DO whatever it Takes" shows the original because we didn't reassign the value

        String str2 = text.toUpperCase();
        System.out.println(str2);

        text = text.concat(str2).toUpperCase();//it will show all upper case 2 times
        //because we attached one string to the other one //result -->DO WHATEVER IT TAKESDO WHATEVER IT TAKES

        System.out.println(text);

        text += text.concat(str2).toUpperCase();// 5 times of the "DO WHATEVER IT TAKES"
        System.out.println(text);




    }
}