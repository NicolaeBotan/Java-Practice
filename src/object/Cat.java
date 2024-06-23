package object;

public class Cat {

    String name; //declared an instance variable
    String color;
    int age;
    int foodAmount = 20; //declared and initialized an instance variable. By default, the foodAmount is 20.

    //create a method that will print out
    //" Tom is sleeping"
    // use the method in the Test class
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
//create one method that will return an int number
    //that is indicating how many miles user run

    public int run() {
        System.out.println(name + " is running");
        return 3;//it will not show the 3
    }
//create a method that will return a String value--> ...
    // ... " is walking to ... destination"

    public String walk(String destination) {

        return name + " is walking " + destination;
    }

    //create a method that will initialize the color of the cat
    public void setColor(String color1) {

        color = color1;
    }

    //create a method that will return color of cat
    public String getColor() {

        return color;
    }
//create a method that will print and return all proprieties of cat

    public String allInfo() {
        //we chose String data type because we will attach the numbers
        //as a String/text value
        //we can also use the data type as 'Object' data type
        System.out.println(name + " - " + color + " - " + " " + age + " - " + foodAmount);

        return "*******" + name + " - " + color + " - " + " - " + age + " - " + foodAmount + "*******";
        //since "name" is a string type rest is ok to attach
    }
//set the age of cat,get the age of cat by using the method
//ones you gat the age print "in 10 years your age will be..."

    public void setAge(int age1) {
        age = age1;
    }

    public int getAge() {
        return age;
    }
}
