package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει αστεράκια σε εμβαδον σύμφωνα
 * με τον αριθμό που θα δώσει ο χρήστης.
 */
public class ForLoopApp_3 {
    public static void main(String[] args) {
        /* Μεταβλητές */
        Scanner in = new Scanner(System.in);
        int n = 0;

        /* Εντολές */
        System.out.println("Provide your number:");
        n = in.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
