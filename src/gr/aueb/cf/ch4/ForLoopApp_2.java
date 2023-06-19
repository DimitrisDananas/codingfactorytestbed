package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει αστεράκια κάθετα σύμφωνα
 * με τον αριθμό που θα δώσει ο χρήστης.
 */
public class ForLoopApp_2 {
    public static void main(String[] args) {
        /* Μεταβλητές */
        Scanner in = new Scanner(System.in);
        int n = 0;

        /* Εντολές */
        System.out.println("Provide your number:");
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
