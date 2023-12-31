package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Definition of simple Student class.
 * POJO (Plain Old Java Objects).
 * Student Java Bean.
 */
public class Students {
    private static int studentsCount;
    static Scanner in = new Scanner(System.in);

    static {
        int num = in.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
    }

    private int id;
    private String firstname;
    private String lastname;

    public Students() {
        studentsCount++;
    }

    public Students(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount(){
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
