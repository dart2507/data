public class Main{
    public static void main(String args[]){
        Shape shape = new Shape();
        double rectangleArea = shape.area(5, 10);
        double rectanglePerimeter = shape.perimeter(5, 10);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        double squareArea = shape.area(5);
        double squarePerimeter = shape.perimeter(5);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);

        double circleArea = shape.area(5, true);
        double circlePerimeter = shape.perimeter(5, true);  
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);

        double triangleArea = shape.area(5, 10, true);
        double trianglePerimeter = shape.perimeter(5, 10, 15);
        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Triangle Perimeter: " + trianglePerimeter);

        
    }
}