package oop.finalPractice;

public class Shirt {

    final double PRICE = 11.99; //Final variables should have the name in upperCase
    String color;
    String size;

    public Shirt() {
    }

    //create a Constructor
    public Shirt(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void sale() {
        System.out.println("SALE");
    }

    final public void dye() {
        System.out.println("Color change of Shirt");
    } //FINAL METHOD CAN NOT BE OVERRIDDEN IN THE CHILD CLASS

    final public void dye(String color) {
        System.out.println("Color change of Shirt to " + color);
    } //FINAL METHOD CAN NOT BE OVERRIDDEN IN THE CHILD CLASS
    //BUT THE FINAL METHOD CAN BE OVERLOADED BY CHANGING THE PARAMETER


    @Override
    protected void finalize() {
        System.out.println("*******");
    }
}
