package Practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*
        ask user to enter 3 ingredients in the one line
        ask user to enter any int number
        change the first letter of the ingredients with numbers starting with the given number
        Example:
        -Milk Peanuts Butter
        - int 5
        - output "5ink 6eanuts 7utter
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter 3 ingredients with space in one line");
//        String ingredients = scanner.nextLine();
//        System.out.println("Please enter any integer number");
//        int number = scanner.nextInt();
//        int firsSpace = ingredients.indexOf(' ');
//        int secondsSpace = ingredients.indexOf(' ', firsSpace + 1);
//        String ingredient1 = ingredients.substring(0, firsSpace);
//        String ingredient2 = ingredients.substring(firsSpace + 1, secondsSpace);
//        String ingredient3 = ingredients.substring(secondsSpace + 1);
//        System.out.println("[" + ingredient1 + "]");
//        System.out.println("[" + ingredient2 + "]");
//        System.out.println("[" + ingredient3 + "]");
//        String resultFinal = number + ingredient1.substring(1) + " " +
//                ++number + ingredient2.substring(1) + " " +
//                ++number + ingredient3.substring(1);
//        System.out.println("[" + resultFinal + "]");

        String str = changeFirstLetterOfEachIngredientWithNumber();
    }

    public static String changeFirstLetterOfEachIngredientWithNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 ingredients with space in one line");
        String ingredients = scanner.nextLine();
        System.out.println("Please enter any integer number");
        int number = scanner.nextInt();
        char charNumber = (char) number;
        int firsSpace = ingredients.indexOf(' ');
        int secondsSpace = ingredients.indexOf(' ', firsSpace + 1);
        int firstLetterIngredient1 = ingredients.indexOf(ingredients.charAt(0));
        int firstLetterIngredient2 = ingredients.indexOf(ingredients.charAt(firsSpace + 1));
        int firstLetterIngredient3 = ingredients.indexOf(ingredients.charAt(secondsSpace + 1));

        String resultFinal =  ingredients.replace(ingredients.charAt(firstLetterIngredient1), charNumber)
                .replace(ingredients.charAt(firstLetterIngredient2), ++charNumber)
                .replace(ingredients.charAt(firstLetterIngredient3), ++charNumber);

        System.out.println("[" + resultFinal + "]");

        return resultFinal;
    }
}
