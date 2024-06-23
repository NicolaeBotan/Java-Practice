package object;

public class Phone {

    String shape;
    String color;
    double price;
    boolean cover;

    //some functions

    public void call(long phoneNumber) {
        System.out.println("I am calling >> " + phoneNumber);
    }

    public Phone(String shape, String color, double price, boolean cover) {
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.cover = cover;
        //you can implement anything in the Constructor block
    }

}
