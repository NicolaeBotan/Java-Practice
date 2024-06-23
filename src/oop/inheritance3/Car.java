package oop.inheritance3;

public class Car extends Vehicle{
    String model;
    String engineType;
    public Car (){
        super("525i",1995,"BMW");
    }
    @Override
    public void move(){
        System.out.println(brand + " is moving");
        super.move();//calling the move method from Parent class
    }
    @Override
    Vehicle accelerate(){
        System.out.println("Car is accelerating");
        System.out.println(super.model);//to reach the Parent model
        return new Vehicle("----",5,"Bronco");
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Wrangler",2019,"JEEP");
        vehicle.move();//called from Vehicle Class
        Object i = vehicle.accelerate();
        System.out.println(i);
        Integer i1 = (Integer)vehicle.accelerate();//cast Object into Integer
        System.out.println(i1 *5);
        int i2 = (Integer)vehicle.accelerate();


        Car car = new Car();
        car.move();//BMW is moving
                   //Vehicle is moving --> because we also called the super.move() from parent class
        car.accelerate();
        Vehicle v = car.accelerate();
        System.out.println(v);//it returns a new Vehicle because of the accelerates() method and
                               // will show us the hash code of the location in the memory
        System.out.println(v.model);
        System.out.println(v.year);

        //Car car1 = (Car) car.accelerate(); can NOT be casted because car.accelerate() returns
        // a Vehicle Object (parent) so you can not store it as a child (Car Object)
    }
}
