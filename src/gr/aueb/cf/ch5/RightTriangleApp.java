package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβανει τρεις τιμες απο τον χρηστη
 * a,b,c οπυ α ειναι η υποτεινουσα και
 * b,c οι δυο πλευρες.
 * Ελεγχει αν το τριγωνο ειναι ορθογωνιο, δηλ. \
 * α^2 = b^2 + c^2
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Provide a, b and c:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a*a - (b*b + c*c)) <= EPSILON;

        if (isRight) {
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }
    }
}
