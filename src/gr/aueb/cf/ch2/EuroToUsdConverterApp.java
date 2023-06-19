package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroToUsdConverterApp {
    public static void main(String[] args) {
        //Δηλωση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;


        //Εντολες
        System.out.println("Please insert an amount (in Euros):");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτυπωση αποτελεσματων
        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
