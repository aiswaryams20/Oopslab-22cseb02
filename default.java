/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;
class ParentClass {
    protected String protectedProperty = "This is a protected property";
    String defaultProperty = "This is a default property";
}
class ChildClass extends ParentClass {
    public void accessProperties() {
        System.out.println(protectedProperty);
        System.out.println(defaultProperty);
    }
}
public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.accessProperties();
    }
}

