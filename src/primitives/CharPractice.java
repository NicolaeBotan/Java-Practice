package primitives;

public class CharPractice {
    public static void main(String[] args) {
        char letter1 = 'A';
        System.out.println(letter1);// A
char symbol1 = '*';
        System.out.println(symbol1);// *
char letter2 = 'z';
        System.out.println(letter2);// z
char symbol2 = '6';
        System.out.println(symbol2);
        System.out.println( symbol2 + letter2 );// expectation is 6z, but comes 176 ( 6 + z--> adds the
                                                      //dec from ASCII table 6=54, z=122; total 176
int symbol3 = 'z';
        System.out.println(symbol3);//122 because z is 122 in ASCII
char symbol4 = 90;
        System.out.println(symbol4); // Z because 90 is Z in ASCII

        //try to do similar implementation for your first initial

        int name1 = 'N';
        System.out.println(name1);
        char name2 = 78;
        System.out.println(name2);
 // you want to print everything just as is on the single print

        System.out.println("" + name1 + name2 );
        System.out.println("" + name1 + "-"  + name2 );

    }


}
