/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;
import java.util.Scanner;
public class ValidateEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
public static boolean isValidEmail(String email) {
      String regex = "^[A-Za-z0-9._-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
       return email.matches(regex);
    }
}

