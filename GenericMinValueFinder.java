/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42;
public class GenericMinValueFinder {

    public static <T extends Comparable<T>> T findMinValue(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(minValue) < 0) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 2, 7};
        Double[] doubleArray = {3.14, 2.71, 1.0, 2.5, 4.0};
        String[] stringArray = {"apple", "banana", "orange", "kiwi", "grape"};

        System.out.println("Minimum value in the integer array: " + findMinValue(intArray));
        System.out.println("Minimum value in the double array: " + findMinValue(doubleArray));
        System.out.println("Minimum value in the string array: " + findMinValue(stringArray));
    }
}

