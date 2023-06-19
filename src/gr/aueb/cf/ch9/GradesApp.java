package gr.aueb.cf.ch9;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GradesApp {
    public static void main(String[] args) {
        String line;
        String[] students;
        Logger logger = getLogger();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\tmp\\grades.txt"));
             PrintWriter pw = new PrintWriter("C:\\tmp\\primOut.txt")){
            while((line = br.readLine()) != null){
                students = line.split(" +");
                String firstName = students[0];
                String lastName = students[1];
                double grade1 = Double.parseDouble((students[2]));
                double grade2 = Double.parseDouble((students[3]));
                double average = (grade1 + grade2) / 2;

                if ((grade1 < 0 || grade1 > 10) || (grade2 < 0 || grade2 > 10)){
                    logger.severe("Wrong grades!");
                }else {
                    pw.printf("%s %s %.2f\n", firstName, lastName, average);
                }
            }

        }catch (IOException e){
            System.out.println("File not found");
        }
    }


    public static Logger getLogger(){
        Logger logger = Logger.getLogger(GradesApp.class.getName());
        Handler fileHandler;

        try {
            fileHandler = new FileHandler("C:\\tmp\\log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        logger.addHandler(fileHandler);
        return logger;
    }
}
