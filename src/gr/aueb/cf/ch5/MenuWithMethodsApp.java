package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανιζει στον χρηστη ενα μενου 6 επιλογων
 * και του επιτρεπει να διαλεξει οποια απο αυτες
 * θελει.
 */
public class MenuWithMethodsApp {
    public static void main(String[] args) {
        // Μεταβλητες
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int stars = 0;

        // Εντολές
        do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφανισε n αστεακια καθετα");
            System.out.println("3. εμφάνισε n γραμμες με n αστερακια");
            System.out.println("4. Εμφάνισε n γραμμες με αστερακια 1 - n");
            System.out.println("5. Εμφάνισε n γραμμες με αστερακια n - 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Δώσε μία επιλογή: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Δώστε αριθμό για αστεράκια: ");
                    stars = in.nextInt();
                    horizontalStars(stars);
                    break;
                case 2:
                    System.out.print("Δώστε αριθμό για αστεράκια: ");
                    stars = in.nextInt();
                    verticalStars(stars);
                    break;
                case 3:
                    System.out.print("Δώστε αριθμό για αστεράκια: ");
                    stars = in.nextInt();
                    areaStars(stars);
                    break;
                case 4:
                    System.out.print("Δώστε αριθμό για αστεράκια: ");
                    stars = in.nextInt();
                    ascendingStars(stars);
                    break;
                case 5:
                    System.out.print("Δώστε αριθμό για αστεράκια: ");
                    stars = in.nextInt();
                    descendingStars(stars);
                    break;
                case 6:
                    System.out.println("Έξοδος από το πρόγραμμα");
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
                    break;
            }
        } while (choice <= 6 && choice >= 1);
    }

    public static void horizontalStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void verticalStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void areaStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ascendingStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void descendingStars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}