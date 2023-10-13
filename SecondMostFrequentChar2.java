/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;
import java.util.Scanner;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        int[] charFrequencies = new int[128];

       
        for (char c : inputString.toCharArray()) {
            charFrequencies[c]++;
        }

       
        char mostFrequent = 0;
        char secondMostFrequent = 0;

        for (int i = 0; i < charFrequencies.length; i++) {
            if (charFrequencies[i] > charFrequencies[mostFrequent]) {
                secondMostFrequent = mostFrequent;
                mostFrequent = (char) i;
            } else if (charFrequencies[i] > charFrequencies[secondMostFrequent] && i != mostFrequent) {
                secondMostFrequent = (char) i;
            }
        }

        
        System.out.println("The given string is: " + inputString);
        System.out.println("The second most frequent char in the string is: " + secondMostFrequent);
    }
}

