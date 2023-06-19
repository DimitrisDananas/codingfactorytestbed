package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Παιρνει εναν διψηφιο και προσθετει τα ψηφια του
 */
public class TwoDigitsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        System.out.println("Please insert a two digit integer: ");
        num = scanner.nextInt();
        leftDigit = num / 10;
        rightDigit = num % 10;

        sum = leftDigit + rightDigit;

        System.out.println(sum);
    }
}
