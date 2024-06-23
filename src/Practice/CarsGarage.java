package Practice;

import java.util.ArrayList;

public class CarsGarage {
    public static ArrayList<String> getCars(ArrayList<String> garage) {
        garage.add("Toyota");
        garage.add("Honda");
        garage.add("BMW");
        garage.add("Audi");

        return garage;
    }

    public static void main(String[] args) {
        ArrayList<String> garage = new ArrayList<>();
        ArrayList<String> garage1 = new ArrayList<>();

        garage.add("Toyota");
        garage.add("Honda");
        garage.add("GMC");
        garage.add("Chevrolet");

        System.out.println(garage);//[Toyota, Honda, GMC, Chevrolet]
        System.out.println(getCars(garage1));//[Toyota, Honda, BMW, Audi]
        System.out.println(getCars(garage));//[Toyota, Honda, GMC, Chevrolet, Toyota, Honda, BMW, Audi]
    }
}
