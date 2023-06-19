package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Οριζει μια μεθοδο που υπολογιζει το παραγοντικο του n (n!).
 */
public class FactoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert an int");
        n = in.nextInt();

        System.out.printf("%d! = %d", n, facto(n));
    }

    /**
     * Iterative version of n!
     *
     * @param n     the number of n!
     * @return      1*2*..*n
     */
    public static int facto(int n){
        int facto = 1;

        for (int i = 1; i <= n; i++){
            facto *= 1;
        }

        return facto;
    }
}
