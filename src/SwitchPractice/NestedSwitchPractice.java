package SwitchPractice;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
        /*
        1- IT Department
            -John
            -Marry
        2- Accounting
            -Jake
            -Bill
        3- HR
            -Anna
            -Diana
            -Mike
        4- Help Desk
            -EFE
         */
        System.out.println("Please choose from " +
                "following Departments: \n1- IT \n2- Accounting \n3- HR \n4- Help Desk");

        Scanner input = new Scanner(System.in);
        int department = input.nextInt();
        switch (department) {
            case 1:
                System.out.println("You want to speak with John or Marry?");
                input.nextLine();
                String name = input.nextLine();
                name = name.toLowerCase();
                switch (name) {
                    case "john":
                        System.out.println("you can speak with " + name);
                        break;
                    case "marry":
                        System.out.println("you can speak with " + name);
                        break;
                    default:
                        System.out.println("There is no such a person " + name);
                }
                break;
            case 2:
                System.out.println("You reached the Accounting. you want to speak with Bill/Jake?");
                input.nextLine();
                String name1 = input.nextLine();
                name1 = name1.toLowerCase();
                switch (name1) {
                    case "bill":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "jake":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("There is no such a person " + name1);
                }
                break;
            case 3:
                System.out.println("You reached out the HR department. Who do you want to " +
                        "speak with? Anna / Diana /Mike ");
                input.nextLine();
                String name2 = input.nextLine();
                name2 = name2.toLowerCase();
                switch (name2) {
                    case "anna":
                        System.out.println("You can speak with Anna " + name2);
                        break;
                    case "diana":
                        System.out.println("You can speak with Diana " + name2);
                        break;
                    case "mike":
                        System.out.println("You can speak with Mike " + name2);
                    default:
                        System.out.println("There is no such a person " + name2);
                        break;
                }
                break;
            case 4:
                System.out.println("You have reached Help Desk. You can speak with EFE");
            default:
                System.out.println("There is no matching department for your entry");
                break;
        }

    }

}

