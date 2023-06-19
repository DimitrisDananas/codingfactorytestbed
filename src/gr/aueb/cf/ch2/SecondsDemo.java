package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Παιρνει δευτερολεπτα και τα μετατρεπει
 * σε ωρες λεπτα και δευτερολεπτα
 */
public class SecondsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int remainingSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert the total of seconds:");
        totalSeconds = scanner.nextInt();

        hours = totalSeconds / SECONDS_PER_HOUR;
        remainingSeconds = totalSeconds % SECONDS_PER_HOUR;

        minutes = remainingSeconds / SECONDS_PER_MINUTE;
        remainingSeconds = remainingSeconds % SECONDS_PER_MINUTE;

        seconds = remainingSeconds;

        System.out.printf("%d total seconds are equal to %d hour(s), %d minute(s), %d second(s)", totalSeconds, hours, minutes, seconds);
    }
}
