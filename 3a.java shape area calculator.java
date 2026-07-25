package shapes;

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);

        System.out.println("Circle Area = " + circle.area());
        System.out.println("Rectangle Area = " + rectangle.area());
    }
}
