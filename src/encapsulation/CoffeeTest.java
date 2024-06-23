package encapsulation;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        coffee.setAmount(8);
        System.out.println(coffee.getAmount());//8

        System.out.println(coffee.getBrand());//null
        coffee.setBrand("Nescafe");
        System.out.println(coffee.getBrand());//now since we initialized the brand is "Nescafe"

        coffee.setCoffeeType("Late");
        System.out.println(coffee.getCoffeeType());//Late







    }
}
