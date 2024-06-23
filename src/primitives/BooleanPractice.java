package primitives;

public class BooleanPractice {
    public static void main(String[] args) {
        //true or false only when you use boolean

        boolean isCold = true;
        boolean isBreak;
        isBreak = false;
        isCold = false;
        System.out.println(isBreak);//false
        System.out.println(isCold);//false (because I changed the value on the way)
        //boolean isStudying = "yes"; (you can not assign yes or no to boolean data type, compile time error
        //example  2 = 2--> yes
        boolean result1 = 2 == 2; //true
        System.out.println( ">>>>>  " +  result1);//true
        boolean result2 = 2 == 3;//false
        System.out.println( result2);//false
        System.out.println("=======================" );
        // ! mark --> makes the boolean value to opposite ==> true will convert to false
        boolean isLightOn = true;
        System.out.println(isLightOn);//true
        System.out.println(!isLightOn);// false because i used (!) before isLightOn
        System.out.println(isLightOn); //true
        isLightOn = !isLightOn;
        System.out.println(isLightOn);// false





    }


}
