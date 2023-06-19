import java.util.Scanner;

public class MenuExample {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            choice = getChoice();

            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ επιλέξτε ξανά.");
            }
        } while (choice != 5);
    }

    private static void displayMenu() {
        System.out.println("Επιλέξτε μία επιλογή:");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Exit");
    }

    private static int getChoice() {
        int choice;
        do {
            System.out.print("Εισάγετε την επιλογή σας: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                break;
            } else {
                System.out.println("Μη έγκυρη εισαγωγή. Παρακαλώ προσπαθήστε ξανά.");
                scanner.next(); // Απορρίπτουμε τη μη έγκυρη είσοδο του χρήστη
            }
        } while (true);
        return choice;
    }

    private static void printChoice(int choice) {
        if (choice >= 1 && choice <= 5) {
            System.out.println("Επιλέξατε την επιλογή: " + choice);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
