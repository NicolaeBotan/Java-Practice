package arrayList;

import java.util.ArrayList;

public class Computer {
    /*
    Create a Computer class under ArrayList Package
    -have instance fields of: brand,price,color, screenSize
    -create one Constructor to initialize all instance variables
    - create a Test class
    -Store 4 computer Objects in an ArrayList
    - show proprieties of each computer from the list
     */
    String brand;
    double price;
    String color;
    double screenSize;

    //we are creating the Constructor
    public Computer(String brand, double price, String color, double screenSize) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Computer =>" + brand + " - " + screenSize + " - " + price + " - " + color;
    }
    /*
        //Task create a method that will get an ArrayList as parameter
        //this method will find out computers that have the price more than $1200
        //and the screenSize is more than 13.5
        //this method will store and return those computers as a new ArrayList
     */

    public static ArrayList<Computer> filter(ArrayList<Computer> devices) {
        ArrayList<Computer> newList = new ArrayList<>();
        for (Computer item : devices) {
            if (item.price > 1200 && item.screenSize > 13.5) {
                newList.add(item);
            }
        }
        return newList;
    }
    //find and tell me the total prices of computers, so I can buy all of them
    //crete a method to solve this
    public static Double priceFilter(ArrayList<Computer> devices){
        double totalPrice =  0;
        for (Computer item : devices){
            totalPrice += item.price;
        }
        //System.out.println("Total price of all computers is - $" +totalPrice);
        return totalPrice;
    }

}
