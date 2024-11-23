
// Abstract class Shape
abstract class Shape {
    int dimension1; // First dimension (e.g., length, base, radius)
    int dimension2; // Second dimension (e.g., breadth, height)

    // Constructor to initialize dimensions
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method to print area
    abstract void printArea();
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth); // Call the constructor of the Shape class
    }

    // Override printArea to calculate and display the area of a rectangle
    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("The area of the Rectangle is: " + area);
    }
}

// Triangle class extends Shape
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height); // Call the constructor of the Shape class
    }

    // Override printArea to calculate and display the area of a triangle
    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("The area of the Triangle is: " + area);
    }
}

// Circle class extends Shape
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); // Only one dimension is relevant for a circle
    }

    // Override printArea to calculate and display the area of a circle
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("The area of the Circle is: " + area);
    }
}

// Main class to test the program
public class shapeDemo {
    public static void main(String[] args) {
        // Create objects for each shape
        Shape rectangle = new Rectangle(10, 5); // Length = 10, Breadth = 5
        Shape triangle = new Triangle(6, 8);    // Base = 6, Height = 8
        Shape circle = new Circle(7);          // Radius = 7

        // Display areas of the shapes
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}