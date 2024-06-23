package primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1 = 6;
        byte b2 = 3;
       // byte sum1 = b1 + b2; COMPILE TIME ERROR
        int sum1 = b1 + b2;
        System.out.println(sum1);
        double d1 = 2.3;
        int i1 = 3;
        double result = d1 * i1;//java wants to store the result as double because result is not a whole number
        System.out.println(result);

        short sh2 = 45;
        long l1 = 9;
        //short result1 = sh2 - l1; Java wants to store in larger data type
        // so short data type is no working
        long result1 = sh2 - l1;
        System.out.println(result1);
        int result3 = b1 + sh2;
        System.out.println(result3);

        float fl1 = 9.0f;
        double result5 = d1 + fl1;
        System.out.println(result5);
        float result6 = l1 + fl1;//because there is a decimal number so in float its more storage
        System.out.println(result6);




    }

}
