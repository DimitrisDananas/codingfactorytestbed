package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CitiesIOApp {
    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:\\tmp");

        if (!dir.exists()){
            if (!dir.mkdir()){
                System.out.println("Error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\tmp\\cities.txt"))){
            while ((line = bf.readLine()) != null){
                cities = line.split(" +");
                switch (cities[0]){
                    case "Greece":
                        File grFile = new File(dir + "/" + cities[0].substring(0,2).toLowerCase() + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "Gr Cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        File usaFile = new File(dir + "/" + cities[0].substring(0,2).toLowerCase() + ".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        File gerFile = new File(dir + "/" + cities[0].substring(0,2).toLowerCase() + ".txt");
                        PrintStream ger = new PrintStream(gerFile, StandardCharsets.UTF_8);
                        print(ger, "DE Cities");
                        print(ger, cities);
                        break;
                    default:
                        System.err.println("Error in cities");
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String message){
        ps.println(message);
    }

    public static void print(PrintStream ps, String[] tokens){
        for (int i = 1; i < tokens.length; i++){
            ps.print(tokens[i] + " ");
        }
    }
}
