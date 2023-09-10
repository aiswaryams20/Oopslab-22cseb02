/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persons;

/**
 *
 * @author AISWARYA.MS
 */
//public class Persons {

    /**
     * @param args the command line arguments
     */
  //  public static void main(String[] args) {
        // TODO code application logic here
import java.util.Scanner;

class Person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }
}

class Student extends Person {
    private String programName;
    private int studyYear;
    private double fees;

    public String getProgramName() {
        return programName;
    }
 public int getStudyYear() {
        return studyYear;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return super.toString() + ", Program Name: " + programName + ", Study Year: " + studyYear + ", Fees: " + fees;
    }
}

class Staff extends Person {
    private String schoolName;
    private double payment;

    public String getSchoolName() {
        return schoolName;
    }

    public double getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + ", School Name: " + schoolName + ", Payment: " + payment;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of users: ");
        int numUsers = scanner.nextInt();
        scanner.nextLine();

        Person[] users = new Person[numUsers];

        for (int i = 0; i < numUsers; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            System.out.print("Enter 'S' for student or 'T' for staff: ");
            String userType = scanner.nextLine();

            if (userType.equalsIgnoreCase("S")) {
                Student student = new Student();

                System.out.print("Enter program name: ");
            }
        }
    }
}
