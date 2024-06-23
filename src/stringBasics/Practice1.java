package stringBasics;

public class Practice1 {
    public static void main(String[] args) {
       String word = "Fluffy";
        System.out.println( word );
        System.out.println( word + 5 + 3);//Fluffy53 (concatenation)

        //reassignment
        word = " Test ";//so word is not "Fluffy" but is "Test"
        System.out.println(word);// Test
        //compound assignment
        word += word;// word = word + word; attached word with word
        System.out.println(word); //result is TestTest
       String text = "1234";
        System.out.println(text + 100 );//1234100 ( 100 was attached to text "1234");
        System.out.println( text + word ); // 1234 Test Test (they apply only one time when print
        System.out.println(text);//1234
        text += "5";//text= text + "5"/// "1234" + "5" (the 5 text was attached to text(1234) value
        System.out.println(text);//12345

        text += 6;
        System.out.println(text);//123456

        int number = 333;
        text += number;
        System.out.println(text);//123456333

        String name = "Java" + 111;
        System.out.println(name);//Java111

        String lastName = "Selenium" +'t';
        System.out.println(lastName); //Seleniumt

        name = "Jenny";
        lastName = "Brown";

        name = name + lastName;//Concatenation
        System.out.println(name);//Jenny Brown
        System.out.println(lastName);//Brown

        String lunch = new String( "Burger");//this creates a new String object
        System.out.println(lunch);//Burger
        lunch += " with fries";
        System.out.println(lunch); // Burger with fries





    }
}
