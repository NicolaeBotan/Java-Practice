package SwitchPractice;

public class Practice1 {
    public static void main(String[] args) {
        int count = 2;

        switch ( count ){

            case 5 :
                System.out.println("Red");// it can be multiple lines of code in one case
                break;//use this to stop the execution here
            case 2 :
                System.out.println("Yellow");//if switch matches with case 2, it will print everything
                System.out.println("yellow");     // that is included in case 2
                System.out.println("yELLOW");
                int number = 9;
                System.out.println(number * number);
                break;//use this to stop the execution here
            case 1 :
                System.out.println("White");
                break;//use this to stop the execution here
            case 10 :
                System.out.println("Pink");
            default :
                System.out.println("NO COLOR");
                break; //use this to stop the execution here

        }
        System.out.println("This is the end of switch statement");


    }
}
