/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
  try ( Scanner obj = new Scanner(System.in)) {
      System.out.println("Simple Calculator");
      System.out.print("Enter first number: ");
      double num1 = obj.nextDouble();
      System.out.print("Enter an operator (+, -, *, /): ");
      char operator = obj.next().charAt(0);
      System.out.print("Enter second number: ");
      double num2 = obj.nextDouble();
      try {
          double result = calculate(num1, num2, operator);
          System.out.println("Result: " + result);
      } catch (ArithmeticException | IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
      }
        }    }
  static double calculate(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                result = num1 / num2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return result;
    }
}
