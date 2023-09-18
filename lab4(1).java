/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.Scanner;
abstract class Shape {
    protected int numSides;
 public Shape(int numSides) {
        this.numSides = numSides;
    }
 public int getNumSides() {
        return numSides;
    }
public abstract double getArea();
 public abstract double getPerimeter();
}
class Rectangle extends Shape {
    private final double width;
    private final double height;
public Rectangle(double width, double height) {
        super(4); 
        this.width = width;
        this.height = height;
    }
@Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
class Triangle extends Shape {
    private final double base;
    private final double height;
 public Triangle(double base, double height) {
        super(3); 
        this.base = base;
        this.height = height;
    }
 @Override
    public double getArea() {
        return 0.5 * base * height;
    }
@Override
    public double getPerimeter() {
        return 3 * base;
    }
}
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the width and height of the rectangle: ");
            double rectWidth = scanner.nextDouble();
            double rectHeight = scanner.nextDouble();
            System.out.print("Enter the base and height of the triangle: ");
            double triBase = scanner.nextDouble();
            double triHeight = scanner.nextDouble(); 
            Rectangle rectangle = new Rectangle(rectWidth, rectHeight);
            Triangle triangle = new Triangle(triBase, triHeight);
            System.out.println("Rectangle :");
            System.out.println("Number of sides: " + rectangle.getNumSides());
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
            System.out.println("\nTriangle :");
            System.out.println("Number of sides: " + triangle.getNumSides());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        }
    }
}


