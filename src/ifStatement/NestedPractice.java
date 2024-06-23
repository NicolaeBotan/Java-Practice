package ifStatement;

public class NestedPractice {
    public static void main(String[] args) {
           /*
           check ID
           check Visa
           check Ticket
            */
        boolean id = true, visa = true, ticket = true;

        System.out.println("Checking ID now...");

        if( id ){   //if id is false--> visa and ticket will not work
            System.out.println("Checking visa now...");
            if(visa){
                System.out.println("Checking Ticket now...");
                if( ticket){

                    System.out.println("Enjoy your flight");

                }else{

                    System.out.println("You should have a Ticket");
                }

            }else{

                System.out.println("You should have Visa");
            }

        }else{

            System.out.println("First, you should have a valid ID");
        }


    }
}
