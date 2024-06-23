package ifStatement;

import java.util.Scanner;

public class NestedTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you know Java? yes/no");
        String answer1 = scanner.nextLine();

        if(answer1.equalsIgnoreCase("yes")){

            System.out.println("Do you know Selenium? yes/no");
            String answer2 = scanner.nextLine();
            if(answer2.equalsIgnoreCase("yes")){

                System.out.println("Do you know API Testing? yes/no");
                String answer3 = scanner.nextLine();
                if(answer3.equalsIgnoreCase("yes")){

                    System.out.println("Are you familiar with SQL? yes/no");
                    String answer4 = scanner.nextLine();
                    if(answer4.equalsIgnoreCase("yes")){
                        System.out.println("You are HIRED!!!");

                    }else{
                        System.out.println("We need someone that knows SQL.");
                    }

                }else{
                    System.out.println("We need someone that knows API Testing.");
                }

            }else{
                System.out.println("We are looking for someone that knows Selenium");
            }

        }else{
            System.out.println("We are looking for someone that Knows Java.");
        }



    }
}
