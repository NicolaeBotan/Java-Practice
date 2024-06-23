package object;

public class Shape {
    //calculate perimeter of rectangle

    //width and length..... 2 * (w +l)

   // int w = 5, l = 10, p = 0;
   // p = 2 * (w + l);

    public void perimeterCalculator ( int width, int length ) {

        int perimeter = 2 * (width + length);
        System.out.println("The perimeter of rectangle is " + perimeter);


    }
    //create a method that will calculate area of a triangle
    // A = (base * height)/2
       public void areaTriangle ( double base, double height){

        double area = (base * height)/2;
           System.out.println("Triangle area is " + area);
       }







}
