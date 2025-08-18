package Oops;
// Abstract class
abstract class Shape {
    double area; // Instance variable
    abstract double calculateArea(); // Abstract method
    void display() { // Concrete method
        System.out.println("Shape area: " + area);
    }
}

// Interface
interface Drawable {
    void draw(); // Abstract method
    default void print() { // Default method (Java 8+)
        System.out.println("Drawing a shape");
    }
}

// Concrete class implementing abstract class and interface
class Circle extends Shape implements Drawable {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() { // Implement abstract method
        area = Math.PI * radius * radius;
        return area;
    }
    @Override
    public void draw() { // Implement interface method
        System.out.println("Drawing Circle with radius: " + radius);
    }
}

public class AbstractExam {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        circle.display(); // From abstract class
        circle.draw();    // From interface
        circle.print();   // Default method from interface
    }
}
