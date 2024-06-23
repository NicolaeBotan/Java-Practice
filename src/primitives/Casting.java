package primitives;

public class Casting {

    public static void main(String[] args) {
        //impilcit
        int num = 23;
        long numl = num;
        //explicit casting
        int count = 25;
        short countSh = (short) count;
        System.out.println(count);//25
        System.out.println(countSh);//25

        int number = 128;
        System.out.println("number is " + number);
        byte numberBt = (byte) number;
        System.out.println("number is the byte type " + numberBt);//its -128
        //byte is (-128 to 127) when number passes 127, it goes back to negative and adds more
        //example
        int number1 = 130;
        byte numberBt1 = (byte)number1;// result is -126, because 130-127=3, goes back negative and adds
                                       // so comes as -126
        System.out.println(numberBt1);

        double weight = 3.4;
        int weight2 = (int)weight;
        System.out.println(weight2);

        int example = (int)25.6;
        System.out.println(example);

        byte b1 = 23, b2 = 12;
        byte sum1 = (byte)(b1 + b2);
        short sum2 = (short)(b1 + b2);

        //compound assignments ---> +=,-=,*=,/=,%=;
        byte result1 = 12;//byte data type
        System.out.println(" result1 is " + result1 );

        result1 += example;//from int data type whent to byte data type because of +=(compound assignment
        System.out.println( "result1 after example is " + result1);
        //whenever you use compound assignment the CASTING IS GONNA WORK BY ITSELF
        //compound assignment is making the casting happen

        example -= 1.2;//example is int im trying to store a decimal(double)
        System.out.println("example after 1.2 is " + example );





    }
}
