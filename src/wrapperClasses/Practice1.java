package wrapperClasses;

public class Practice1 {
    public static void main(String[] args) {
        byte bt = 4;
        Byte b1 = new Byte(bt);

        Byte b2 = 6;//AutoBoxing,Java converts primitive data into wrapper object

        Integer i1 = 11;//AutoBoxing
        System.out.println(i1);//11
        //these objects will act like regular numbers, you can do any calculations , anything, but
        //they are Objects
        System.out.println(i1 + 55);//66
        System.out.println(b2 * i1);//66

        Character letter1 = new Character('t');
        Character letter2 = 'r';
        String str = letter2.toString().concat("Testing");
        System.out.println(str);//rTesting

        //some Example of UnBoxing

        int a = i1;//UnBoxing--> converting from wrapper to primitive data
        System.out.println(a);//11 same value as i1 object

        byte bt2 = b1;//UnBoxing
        byte bt3 = (byte) (b1 + i1);//casting, forcing Java to store as a primitive byte

    }
}
