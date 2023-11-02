/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;
import java.io.*;

public class FileStreamExample {
    public static void main(String[] args) {
        String binaryData = " Binary Data";
        try (FileOutputStream fos = new FileOutputStream("binary_file.dat")) {
            byte[] bytes = binaryData.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
        }

        try (FileInputStream fis = new FileInputStream("binary_file.dat")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
        }

        String textData;
        textData = " Text Data";
        try (FileWriter fw = new FileWriter("text_file.txt")) {
            fw.write(textData);
        } catch (IOException e) {
        }

        try (FileReader fr = new FileReader("text_file.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
        }
    }
}

