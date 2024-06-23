package object;

public class TestFlower {
    public static void main(String[] args) {
        Flower f1 = new Flower();//No Argument Constructor
        f1.type = "Tulip";
        System.out.println(f1.type);//Tulip

        //now im creating another Flower Object to use the Constructor with one Argument
        Flower f2 = new Flower("Daisy");//One Argument Constructor
        System.out.println(f2.type);//Daisy. I initialized the f2 type by using Constructor

        //now we will use 2 Argument Constructor
        Flower f3 = new Flower("Rose","red");
        System.out.println(f3.color);//red

        System.out.println(f1.color);//null
        System.out.println(f1.price);// 0.0
        System.out.println(f3.price);//0.0

        //Example with String
        String str = new String();//String Object
        String str1 = new String("abcd");//initializing the string right away






    }
}
