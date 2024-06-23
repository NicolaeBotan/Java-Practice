package ifStatement;

public class ElsePractice {
    public static void main(String[] args) {

        int money = 100;
        //if your money is more than $100 , you can get the item

        if( money > 100 ){   //it will run only the ELSE because the condition is FALSE
            System.out.println("I can buy an item" );
        }else{
            System.out.println("I can not buy item " );

        }

        money = 101;

        if( money > 100){     //condition is TRUE so it will run the IF statement only (first statement only)
            System.out.println("I can BUY");
        }else{
            System.out.println("I can not buy");
        }






    }
}
