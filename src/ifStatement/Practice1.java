package ifStatement;

public class Practice1 {
    public static void main(String[] args) {

        int money = 100;
        int item$ = 250;
        System.out.println("First print before IF Statement");

        if(money > item$){
            System.out.println("You are buying the Item");
        }
        System.out.println("Another print after IF Statement");
        int item2$ = 99;                            //each IF Statement is independently working
                                                    //they are not affecting each other or the rest of the code
        if (money>item2$){
            System.out.println("I am buying the item2");

        }
        System.out.println("Print after ITEM2");

    //you have the option to use the credit card if the money is not enough
        boolean creditCard = true;
        if(money > item$ || creditCard == true){      //you can use any conditions but at the end you
                                                     //should have true or false
            System.out.println("you are using 2 different options to buy ITEM");

        }







    }
}
