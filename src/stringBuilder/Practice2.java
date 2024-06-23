package stringBuilder;

public class Practice2 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("January");

        Character ch = builder.charAt(0);
        System.out.println(ch);//J

        Integer i = builder.indexOf("y");
        System.out.println(i);//6

        String part = builder.substring(3);
        System.out.println(part);//uary

        //put substring into a new StringBuilder Object
        StringBuilder b2 = new StringBuilder(builder.substring(3));

        //StringBuilder b3 = builder.substring(3);Compile Time Error

        //replace method is different from String replace method
        //provide starting index, ending index and replacement text
        builder.replace(1, 4, "$$$");
        System.out.println(builder);//J$$$ary

        builder = builder.replace(1,4,"***");
        System.out.println(builder);//J***ary


    }
}
