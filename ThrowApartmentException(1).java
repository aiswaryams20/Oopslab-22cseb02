/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;
import java.util.Scanner;

class ApartmentException extends Exception {
    public ApartmentException(String message) {
        super(message);
    }
}

class Apartment {
    private String streetAddress;
    private String apartmentNumber;
    private int numberOfBedrooms;
    private double rent;

    public Apartment(String streetAddress, String apartmentNumber, int numberOfBedrooms, double rent)
            throws ApartmentException {
        if (!apartmentNumber.matches("\\d{3}")) {
            throw new ApartmentException("Invalid apartment number. It must consist of three digits.");
        }
        if (numberOfBedrooms < 1 || numberOfBedrooms > 4) {
            throw new ApartmentException("Invalid number of bedrooms. It should be between 1 and 4.");
        }
        if (rent < 500 || rent > 2500) {
            throw new ApartmentException("Invalid rent amount. It should be between $500 and $2,500.");
        }

        this.streetAddress = streetAddress;
        this.apartmentNumber = apartmentNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "streetAddress='" + streetAddress + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", rent=" + rent +
                '}';
    }
}

public class ThrowApartmentException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numApartments = 6;
        Apartment[] apartments = new Apartment[numApartments];

        for (int i = 0; i < numApartments; i++) {
            try {
                System.out.println("Enter details for Apartment #" + (i + 1));
                System.out.print("Street Address: ");
                String streetAddress = scanner.nextLine();
                System.out.print("Apartment Number: ");
                String apartmentNumber = scanner.nextLine();
                System.out.print("Number of Bedrooms: ");
                int numberOfBedrooms = Integer.parseInt(scanner.nextLine());
                System.out.print("Rent: $");
                double rent = Double.parseDouble(scanner.nextLine());

                apartments[i] = new Apartment(streetAddress, apartmentNumber, numberOfBedrooms, rent);
                System.out.println("Apartment created successfully: " + apartments[i]);
            } catch (ApartmentException e) {
                System.out.println("Error creating apartment: " + e.getMessage());
                i--; // Decrement the counter to re-enter details for the same index.
            }
        }
    }
}

