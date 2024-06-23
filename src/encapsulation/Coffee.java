package encapsulation;

public class Coffee {
    /*
    TASK ==
    -create a coffee class
    -have 3 instance variables
    -create setters and getters to access those variables
    -in a different class try to access instance variables to initialize
     or manipulate them.
     */

    private String coffeeType;
    private int amount;
    private String brand;

    //here we wll create the setters and getters to be able to access these instance private variables in
    //different classes using the Coffee Object
    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
