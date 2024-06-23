package primitives;

public class CompoundAssignments {

    public static void main(String[] args) {
        int cars = 2;
        System.out.println(cars);//2
        cars = cars + 1;
        System.out.println(cars +  " number of cars after first purchase " );
        cars += 1;
        System.out.println(cars + " number of cars after second purchase ");

        // sell one car
        cars -= 1;
        System.out.println(cars + " after selling one car ");
        // sharing cars with other person
        cars /= 2;
        System.out.println(cars + " after sharing with other person ");
        cars /=2;
        System.out.println(cars + " after sharing single car with other person ");

        int count = 25;
        count %= 7; //count = count % 7;//4 because 21/7=3 and 25-21= 4 leftover
        System.out.println(count);



    }
}
