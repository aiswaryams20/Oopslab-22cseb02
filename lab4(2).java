/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;
interface Resizable {
    void resize(double factor);
}
class Rectangle implements Resizable {
    private double length;
    private double breadth;
public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
 public void printAreaAndPerimeter() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
@Override
    public void resize(double factor) {
        length *= factor;
        breadth *= factor;
    }
}
class Circle implements Resizable {
    private double radius;
public Circle(double radius) {
        this.radius = radius;
    }
public void printAreaAndPerimeter() {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + perimeter);
    }
    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
public class Main {
    public static void main(String[] args) {
 //  rectangle with length 10 and breadth 5
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Original Rectangle:");
        rectangle.printAreaAndPerimeter();
 // Resize the rectangle by a factor of 5
        rectangle.resize(5);
        System.out.println("\nResized Rectangle:");
        rectangle.printAreaAndPerimeter();
//  circle with radius 5
        Circle circle = new Circle(5);
        System.out.println("\nOriginal Circle:");
        circle.printAreaAndPerimeter();
// Resize the circle by a factor of 10
        circle.resize(10);
        System.out.println("\nResized Circle:");
        circle.printAreaAndPerimeter();
    }
}
