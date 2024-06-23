package primitives;

public class LogicalOperators1 {
    public static void main(String[] args) {
        // travelling -->passport and ticket
        boolean passport = true;
        boolean ticket = true;
        boolean travel = passport && ticket;
        System.out.println( " can travel ? " + travel);

        System.out.println("====================================");

        boolean passport1 = false;
        boolean ticket1 = true;
        boolean travel1 = passport1 && ticket1;
        System.out.println( " can travel ? " + travel1);

// party --> dressCode and age
        boolean dress = true;
        boolean age = true;
        boolean pass = dress && age;
        System.out.println("Is allowed? " +pass); //result will be True because both values are true

        ///kids event they are allowed if the age is between age of 12 and 16

        int kidAge = 15;
        int lowerLimit = 12, upperLimit = 16;
        boolean happyToPlay = kidAge > lowerLimit && kidAge < upperLimit;
        System.out.println(happyToPlay);
        //parents want to come together for family dinner but kids that are 12 to 18
        // don't want to go with them
        // adults and younger kids are together

        int kidAge1 = 5;
        int upperLimit1 = 18;
        boolean kidTogether = kidAge1 <= lowerLimit || kidAge1 >= upperLimit1; //true because the kid is 5
        System.out.println(" The 5 years old kid is with parents ? " +kidTogether);
      /* so instead of && we use ||

       */

        // OR ||
        // cash or card
        boolean cash = false;
        boolean card = true;
        boolean buy = cash || card;
        System.out.println(" you can buy " +buy);

        ///travel--> a type of ID (passports or government ID), visa , ticket, money (more then $5000)
        boolean passport2 = false;// is still good because you have gov ID
        boolean governmentId = true;
        boolean visa = true;
        boolean ticket2 = true;
        int reqMoney = 5000;
        int money = 6000;
        boolean travelTo= (passport2 || governmentId) && visa && ticket2 && (money > reqMoney);
        System.out.println( "Can I travel ? " +travelTo);

        System.out.println( true || false && false ); //true because (false&&false=false AND true || false
                                                      // is TRUE (&& is done prior to ||)
        System.out.println( true && false || false ); //false
        System.out.println( (true || false) && false ); //false

        System.out.println("===============================================");
        System.out.println( 'B' + 2 == 3 * 'C' || !true && 'C' < 'B' / 3 );//false
                           //first Java is going to do arithmetical operations and then compare the values




    }
}
