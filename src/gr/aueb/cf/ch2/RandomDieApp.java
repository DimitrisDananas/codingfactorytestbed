package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int dieRoll1 = (int)(Math.random()* 6) + 1;
        int dieRoll2 = (int)(Math.random()* 6) + 1;
        System.out.println(dieRoll1);
        System.out.println(dieRoll2);
        System.out.println("Το max μεταξυ των ζαριων ειναι: " + Math.max(dieRoll1, dieRoll2));
    }
}
