/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication41;
import java.util.ArrayList;
import java.util.List;

class GenericListOperations<T> {
    private List<T> list;

    public GenericListOperations() {
        this.list = new ArrayList<>();
    }

    public void addElementAtBeginning(T element) {
        list.add(0, element);
    }

    public void addElementAtMiddle(int position, T element) {
        list.add(position, element);
    }

    public void addElementAtEnd(T element) {
        list.add(element);
    }

    public void deleteElementAtPosition(int position) {
        list.remove(position);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class ListOperationsDemo {
    public static void main(String[] args) {
        GenericListOperations<Integer> listOperations = new GenericListOperations<>();

        // Add elements
        listOperations.addElementAtEnd(10);
        listOperations.addElementAtEnd(20);
        listOperations.addElementAtEnd(30);

        System.out.println("Original List: " + listOperations);

        listOperations.addElementAtBeginning(5);
        System.out.println("After adding element at the beginning: " + listOperations);

        listOperations.addElementAtMiddle(2, 15);
        System.out.println("After adding element at middle: " + listOperations);

        // Delete element
        listOperations.deleteElementAtPosition(3);
        System.out.println("After deleting element at position 3: " + listOperations);
    }
}
