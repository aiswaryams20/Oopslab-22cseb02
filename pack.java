/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import java.util.Scanner;
import pack1.*;
import pack2.*;
import pack3.*;

public class JavaAppplication21 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int choice,num1,num2;
        String str1,str2;
        
        MathOperation Mat = new MathOperation();
        StringOperation Str = new StringOperation();
        calculator Calc = new calculator();
        
        System.out.println("1.Addition \n2.Subraction \n3.Multiply \n4.Divide \n5.String concatenate \n6.String reverse \n7.Exit");
        do{
        System.out.print("\nEnter the choice : ");
        choice = scan.nextInt(); 

            switch(choice){
                case 1 -> {
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Sum is : " + Mat.add(num1, num2));
                }
                case 2 -> {
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Difference is : " + Mat.subtact(num2, num1));
                }
                case 3 -> {
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Multiplication is is : " + Calc.multiply(num1, num2));
                }
                case 4 -> {
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Divide is : " + Calc.divide((double)num1, (double)num2));
                }
                case 5 -> {
                    System.out.print("\nEnter String 1 : ");
                    str1 = scan.next();
                    System.out.print("Enter String 2 : ");
                    str2 = scan.next();
                    System.out.print("Concatenated Sting is : " + Str.concatenate(str1, str2));
                }
                case 6 -> {
                    System.out.print("\nEnter String : ");
                    str1 = scan.next();
                    System.out.print("Reversed String is : " + Str.reverse(str1));
                }
                case 7 -> System.out.print("Exiting Program\n");
                default -> System.out.print("Invalid Choice\n");
            }
       }while(choice!=7);
    }

    private static class StringOperation {

        public StringOperation() {
        }

        private String reverse(String str1) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String concatenate(String str1, String str2) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class calculator {

        public calculator() {
        }

        private String divide(double d, double d0) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String multiply(int num1, int num2) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

