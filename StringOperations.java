/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication45;
import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    private static ArrayList<String> stringList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void append() {
        stringList.add(scanner.nextLine());
        System.out.println("String appended successfully!");
    }

    private static void insert() {
        int index = scanner.nextInt();
        if (index >= 0 && index <= stringList.size()) {
            stringList.add(index, scanner.nextLine());
            System.out.println("String inserted successfully!");
        } else {
            System.out.println("Invalid index. Insertion failed.");
        }
    }

    private static void search() {
        System.out.println(stringList.contains(scanner.nextLine()) ? "String found!" : "String not found.");
    }

    private static void listStartingWithLetter() {
        char letter = scanner.next().charAt(0);
        stringList.stream().filter(s -> s.toLowerCase().startsWith(String.valueOf(letter).toLowerCase()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nString Operations Menu:\n1. Append\n2. Insert\n3. Search\n4. List starting with letter\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1: append(); break;
                case 2: insert(); break;
                case 3: search(); break;
                case 4: listStartingWithLetter(); break;
                case 5: System.out.println("Exiting program."); break;
                default: System.out.println("Invalid choice. Enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
