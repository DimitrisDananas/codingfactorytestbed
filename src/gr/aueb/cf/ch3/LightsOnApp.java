package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασιζει αν πρεπει να αναψουν τα φωτα
 * ενος αυτοκινητου με βαση τρεις μεταβλητες:
 * αν βρεχει ΚΑΙ ταυτοχρονα ισχυει ενα τουλαχιστον
 * απο τα επομενα: ειναι σκοταδι Ή τρεχουμε
 * (speed > 100). Τισ τιμες αυτες τις λαμβανουμε
 * απο τον χρηστη (stdin).
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if its raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if its dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On: " + lightsOn);
    }
}
