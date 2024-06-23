package primitives;

public class UnaryOperators2 {
    public static void main(String[] args) {
        double d = 8.7;
        d++;
        System.out.println(d); //9.7

        int a = 5;
        int b = ++a;//b=6 and a=6
        int c = a + ++b;//b=7 was added 2 times and a=6
        //c=?
        System.out.println(c);// is 13

        //c = c++ + --a - 2; //16 because c++ is still 13 + 5 - 2
        c = ++c + --a - 2;//17 bacuse ++c is 14
        System.out.println("C is now " + c); //17

        int e = c + 10;
        System.out.println(e);//27 because c is 17

        int k = 8, t = ++k, m = k + t, x = ++m; //++k=9, t=9,m=18,x=19
        System.out.println( --x - --k);//--x= 18, --k=8. so result is 10
        //=================
        //deal on Dunkin Donuts
        /*get one dozen of donuts for $15 you get one dollar discount on your next purchase
         */
        System.out.println("===================================================");
        int dozenD = 15;

        System.out.println(dozenD --);//today 15 but next will be 14dollars(applying the discount next time)
        System.out.println("Next Payment will be " + dozenD);
        int payment1 = 15;
        System.out.println( --payment1 + " payment now with discount " );//discount applied today














    }
}
