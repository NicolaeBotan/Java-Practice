package Practice;

public class SaraPractice {

    public static void getInt(int x){
        x = 5;
    }

    public static int getInt1(int x){
        x += 5;
        return x;
    }


    public static void main(String[] args) {
        int x = 10;
        //System.out.println(getInt(x));

        System.out.println(getInt1(x));//15
    }
}
