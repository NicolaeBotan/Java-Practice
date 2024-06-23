package primitives;

public class Farm {
    public static void main(String[] args) {
/* Task: create a "farm" class and solve the following task in the class
 in a farm there are 120 cows and 45 chickens.
-calculate number of the legs of the animals in this farm
-show the result as the "Total number of legs in the farm is ..."
  */
        int cows = 120;
        int chickens = 45;
        int cowLegs = cows * 4;
        int chickenLegs = chickens * 2;
        int totalLegs = cowLegs + chickenLegs;
        System.out.println( "Total number of legs in the farm is " + totalLegs );

/* if a cow cost 1345.86 and a chicken cost 10.99
calculate worth of animals and show the result as "Worth of animals is ..."
 */
        double cowCost = 1345.86;
        double chickenCost = 10.99;
        double totalCost = cowCost * cows + chickenCost * chickens;

        System.out.println("Worth of animals is " + totalCost );
   /*If you and your partner will share the cost,how much you will get

    */
        double share = totalCost / 2;
        System.out.println(share);




    }


}
