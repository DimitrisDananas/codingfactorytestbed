package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει αστεράκια n έως 1 σύμφωνα
 * με τον αριθμό που θα δώσει ο χρήστης.
 */
public class ForLoopApp_5 {
    public static void main(String[] args) {
        /* Μεταβλητές */
        Scanner in = new Scanner(System.in);
        int n = 0;

        /* Εντολές */
        System.out.println("Provide your number:");
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
