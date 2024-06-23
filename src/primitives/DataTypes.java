package primitives;

public class DataTypes {

    public static void main(String[] args) {

        byte bt1 = 3;
        System.out.println(bt1);
        //byte bt2 = 127; max positive
        //byte bt3 = -128; max negative

short numberSh = 1230;
        System.out.println(numberSh);
int numberI = 100;
        System.out.println(numberI);
long numberL = 12346232228882L; // 'L' tell java its long data type

float number5 = 2.3f;
        System.out.println(number5);
float number6 = .7f;
        System.out.println(number6);
float number7 = 5f;
        System.out.println(number7); //5.0 because of the data type
double numberD = 2;
        System.out.println(numberD); //2.0 because of data type
byte b1 = 5;
short sh1 = b1;
        System.out.println(sh1);// shows 5 because b1 is stored in sh1
       // byte bt2 = sh1; it's not good, the value is good 5 but data type short can not be stored in short
        //compile time error
//int age = numberD; not working because numberD is double(decimal not integer)
        // int age = 2.5; not working because it's not a whole number
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
int number9 = 1_000_000; //underscore easy to read,are ok to use between numeric values
int number10 = 12_345_667;
        System.out.println(number9);
        System.out.println(number10);


    }






}
