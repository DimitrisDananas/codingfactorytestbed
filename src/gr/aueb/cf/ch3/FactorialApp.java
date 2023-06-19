package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Παιρνει απο το χρηστη εναν αριθμο
 * και υπολογιζει το παραγοντικο του
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userNum = 0;
        long facto = 1L;
        int i = 1;

        System.out.println("Please insert one small integer:");
        userNum = in.nextInt();

        while(i <= userNum){
            facto *= i;
            i++;
        }
        System.out.printf("The factorial of %d is: %,d", userNum, facto);
    }
}
