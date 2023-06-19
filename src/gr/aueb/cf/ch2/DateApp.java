package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβαζει απο τον χρηστη 3 ακεραιους και τους αναπαριστα ως ΗΗ/ΜΜ/ΕΕ
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.println("Please give the day then the month and then the year of your date:");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("Your date is: %d/%d/%d", day, month, year % 100);
    }
}
