class Shape{
    //learning method overwritten

    // Rectangle
    double area(double length, double width){
        return length*width;
    }

    double perimeter(double length, double width){
        return 2*(length*width);
    }

    //Square
    double area(double length){
        return length*length;
    }

    double perimeter(double length){
        return 4*length;
    }

    //Circle
    double area(double radius, boolean circle){
        return Math.PI*radius*radius;
    }
    double perimeter(double radius,boolean circle){
        return 2*Math.PI*radius;
    }

    //Triangle
    double area(double base, double height, boolean triangle){
        return 0.5*base*height;
    }
    double perimeter(double side1, double side2, double side3){
        return side1+side2+side3;
    }

}