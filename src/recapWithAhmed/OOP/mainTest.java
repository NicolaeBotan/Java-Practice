package recapWithAhmed.OOP;

public class mainTest extends AbstractPractice1 {
    public static void main(String[] args) {

        //YOU CAN NOT CREATE AN OBJECT FROM ABSTRACT CLASS
        //I CAN ACCESS BY OVERRIDING THE METHODS

        mainTest main = new mainTest();
        main.dismiss();
        main.speak();
    }

    @Override
    public void dismiss() {
        System.out.println("David's class is dismissed");
    }

    @Override
    public void speak() {

        System.out.println("David is speaking");
    }
}
