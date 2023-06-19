package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit;
        int celsius;

        System.out.println("Please type a Fahrenheit temperature:");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("This Fahrenheit temperature is equal to %d Celsius.", celsius);
    }
}
