package ifStatement;

public class CurlyBracketsPractice2 {
    public static void main(String[] args) {

        int k = 3, m = k +5, t = 1;

        if( m >= k ) //condition is TRUE so it will execute both statements

            t = k++ + k + m;

            ++t;

        System.out.println( --t ); //15
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        if( t < ++k ) //the condition is False so ( ++k) statement will be skipped
        ++k;
        ++t;//16
        System.out.println( ++t);// result is 17








    }
}
