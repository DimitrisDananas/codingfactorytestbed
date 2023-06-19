package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβαζερι ωρες λεπτα και δευτερα
 * και μετρατρεπει σε δευτερολεπτα
 */
public class SecondsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PRE_MINUTES = 60;

        System.out.println("Please insert hours, minutes, seconds:");
        inputHours = scanner.nextInt();
        inputMinutes = scanner.nextInt();
        inputSeconds = scanner.nextInt();

        totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PRE_MINUTES + inputSeconds;

        System.out.printf("%d hours, %d minutes, %d seconds = %,d total seconds",
                inputHours, inputMinutes, inputSeconds, totalSeconds);
    }
}
