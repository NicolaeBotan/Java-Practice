package object;

public class TestBottle {
    public static void main(String[] args) {

        Bottle b1 = new Bottle(8);

        b1.liquidAmount = 8;
        b1.updateLiquid(4);//4

        b1.comparison(b1);//b1 is the bottle object

        //create another object that will be a large bottle
        Bottle b2 = new Bottle(10);
        b2.comparison(b2);//It is a large bottle
        b2.liquidAmount = 12;

        System.out.println(b2);//Size: 10.0 isClean: true liquidAmount: 0.0

    }
}
