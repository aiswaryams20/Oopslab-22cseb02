/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;
import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            System.out.print("Enter an index to retrieve a character from the string: ");
            int index = scanner.nextInt();
            try {
                char character = inputString.charAt(index);
                System.out.println("Character at index " + index + " is: " + character);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: StringIndexOutOfBoundsException occurred.");
                System.out.println("Index should be between 0 and " + (inputString.length() - 1));
            }
    }
    }
}
