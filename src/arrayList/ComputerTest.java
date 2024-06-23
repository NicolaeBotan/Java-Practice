package arrayList;

import object.BankAccount;

import java.util.ArrayList;

import static arrayList.Computer.filter;
import static arrayList.Computer.priceFilter;

public class ComputerTest {
    public static void main(String[] args) {
        /*
        Create a Computer class under ArrayList Package
        -have instance fields of: brand,price,color, screenSize
        -create one Constructor to initialize all instance variables
        -create a Test class
        -Store 4 computer Objects in an ArrayList
        - show proprieties of each computer from the list
         */
        ArrayList<Computer> computer = new ArrayList<>();
        Computer c1 = new Computer("Dell", 999.99, "Blue", 15.5);
        Computer c2 = new Computer("Samsung", 899.99, "Black", 17);
        Computer c3 = new Computer("Acer", 1299, "White", 15);
        Computer c4 = new Computer("ASUS", 1199.99, "Gold", 16.5);

        //adding the computers to the ArrayList

        computer.add(c1);
        computer.add(c2);
        computer.add(c3);
        computer.add(c4);

        System.out.println(computer);

        //find computers that are less than $1000
        //show the brand, cost and color

        for (int i = 0; i < computer.size(); i++) {

            if (computer.get(i).price < 1000) {
                System.out.println(computer.get(i).brand + " - "
                        + computer.get(i).price + " - " + computer.get(i).color);
                //Dell - 999.99 - Blue
                //Samsung - 899.99 - Black
            }
        }
        //Task create a method that will get an ArrayList as parameter
        //this method will find out computers that have the price more than $1200
        //and the screenSize is more than 13.5
        //this method will store and return those computers as a new ArrayList

        filter(computer);//we called the static method from Computer class

        System.out.println(filter(computer)); //[Computer =>Acer - 15.0 - 1299.0 - White]

        priceFilter(computer);
        BankAccount account = new BankAccount();
        account.withdraw(priceFilter(computer));


    }
}
