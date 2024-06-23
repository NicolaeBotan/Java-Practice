package primitives;

public class RemainderPractice3 {

    public static void main(String[] args) {

        int numberOfCars = 10;
        int numberOfPartners = 3;
        //how many cars each person will get
        int eachPerson = numberOfCars / numberOfPartners;
        System.out.println(eachPerson);//3

        // how many cars will be leftover
        int leftOverCars = numberOfCars % numberOfPartners;
        System.out.println(leftOverCars);//1
/* TV cost is 465 dollars --> each month you pay 50
find las month payment
 */
        int tvCost = 465;
        int monthPay = 50;
        int lastMonth = tvCost % monthPay;
        System.out.println(lastMonth);
        System.out.println(tvCost / monthPay);

        double tvCost2 = 465.50;
        double monthPay2 = 50;
        System.out.println(tvCost2 % monthPay2);



    }
}
