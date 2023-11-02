/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertToLowerCase {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; 
        String outputFilePath = "output.txt"; 

        try {
            BufferedWriter writer;
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                writer = new BufferedWriter(new FileWriter(outputFilePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    // Split the line into words
                    String[] words = line.split(" ");
                    
                    for (String word : words) {
                        
                        writer.write(word.toLowerCase() + " ");
                    }
                    writer.newLine(); 
                }
                
            }
            writer.close();
            System.out.println("Conversion successful. Check the output file.");
        } catch (IOException e) {
        }
    }
}
