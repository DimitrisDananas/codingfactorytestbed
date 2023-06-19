package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εξετάζει αν το έτος που θα δώσει ο χρήστης
 * είναι δίσεκτο ή όχι.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        /* Μεταβλητές */
        Scanner in = new Scanner(System.in);
        int year = 0;

        /* Εντολές */
        System.out.println("Please provide the year:");
        year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}
