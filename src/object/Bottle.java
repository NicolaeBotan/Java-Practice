package object;

public class Bottle {
    /*
    double size
    boolean isClean
    double liquidAmount
    -create one argument constructor to initialize isClean variable
    -create one argument constructor to initialize size
    -create one usage method which takes double amount as parameter and it will update the
    liquidAmount
     */
    public double size;//we made these public to access them in other package class(from object package to other)
    public double liquidAmount;
    boolean isClean;

    public Bottle(boolean isClean) {
        this.isClean = isClean;
        System.out.println("Is Clean Constructor+++++++ ");
    }

    public Bottle(double size) {
        this(true);//we called the IsClean Constructor in this Constructor
        //so when we will use it in other class with the object, it will execute whatever first constructor
        //has then will go to the next line. This statement must be on the first line inside the Constructor
        this.size = size;
        System.out.println("Size Constructor -------");
    }

    public void updateLiquid(double amount) {
        liquidAmount -= amount;
        System.out.println(liquidAmount + " updated liquid amount");
    }
    //create a method that will take bottle object as a parameter
    //this method will find out if the bottle size is greater than 8oz or not
    //"It is a large bottle" otherwise print is a small bottle

    public void comparison(Bottle bottle) { //I used the Bottle object
        if (bottle.size > 8) {
            System.out.println("It is a large bottle");
        } else {
            System.out.println("It is a small bottle");
        }
    }
    //whenever you print an object toString method, is going to trigger by itself
    //overwriting the toString method that already exists
    public String toString()
    {
        return "Size: "+size + " isClean: " + isClean + " liquidAmount: " + liquidAmount;
    }

}
