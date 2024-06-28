package recapWithAhmed;

public class JavaPrimitiveDataASCIITable {
    /*
    Possible interview Question:
    1-What is Java and what do you know about JDK,JVM,JRE?
    Java: is a programming language. To make a connection between computer and people.

    JDK: Java Development Kit that has some libraries which support the "application development".
    JRE: Java Run Time Environment which is responsible for "Execution".
    JVM: Java Virtual Machine--> 01001110110101--> Is a Virtual Machine that is responsible for
    converting the BYTE Code To Binary Code(1,0)

    PRIMITIVE DATA: It's a way to store the data in it. It doesn't take up too much space in memory.

    --> Whole Numbers:
    - Byte
    - Short
    - int***
    - long*

    -->Decimal numbers:
    - float
    - double***

    -->Condition
    - boolean*

    -->Character
    - char

    ASCII Table: It's a table/alphabet for all the characters(alphabet,digits,symbols,etc...)

    short a = 5;
    short b = 6;
    short c = a+b-2;
    sout(c)




     */
    public static void main(String[] args) {
        short a = 5;
        short b = 6;
        short c = (short) (a + b - 2);//here to make it work we need to cast or provide int
        //because after mathematical operations java is trying to store the data in int
        System.out.println(c);

        char letter = 65;
        char letter2 = 'g';
        int number = 'g'; //you expect the char value as integer,so it's a number from ASCII
        System.out.println(number);//103 from ASCII
        System.out.println(letter2 - letter);//103-65=38
        System.out.println(letter2);//g
        System.out.println(letter);//A

        double amount = 24.5;
        double amount1 = 0.34527;
        //int total = amount1 + amount; Compile time Error because double is a bigger data type then
        //integer, so you cast (int) or store as double
        double total = amount1 + amount;
        System.out.println(total);//24.84527

    }
}
