package object;

public class ShapeTest {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        shape1.perimeterCalculator(2, 6);//return is "The perimeter of rectangle is 16"

        shape1.perimeterCalculator(12, 20);//return is "The perimeter of rectangle is 64"

        shape1.areaTriangle(5, 3);//Triangle area is 7.5
        
    }
}
