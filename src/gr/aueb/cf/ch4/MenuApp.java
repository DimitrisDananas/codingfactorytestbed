package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει στον χρήστη ένα μενού
 * και του δίνει την δυνατότητα να
 * επιλέξει πέντε διαφορετικές επιλογές.
 */
public class MenuApp {
    public static void main(String[] args) {
        /* Μεταβλητές */
        Scanner in = new Scanner(System.in);
        int choice = 0;


        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.print("Πληκτρολογήστε την επιλογή σας: ");
            choice = in.nextInt();
            if (choice < 0 || choice > 5){
                System.out.println("\nΠληκτρολογήσατε αριθμό εκτός ορίων, επιλέξτε ξανά:");
            }
        }while (choice != 5);
    }
}
