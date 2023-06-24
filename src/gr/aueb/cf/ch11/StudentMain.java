package gr.aueb.cf.ch11;

/**
 * Driver class.
 */
public class StudentMain {
    public static void main(String[] args) {
        Students alice = new Students();
        Students bob = new Students(2, "Bob", "D.");

        System.out.println(Students.getStudentsCount());

        // Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(3);

        // Get
        System.out.println("ID " + alice.getId());
        System.out.println("Firstname "+ alice.getFirstname());
        System.out.println("Lastname "+ alice.getLastname());


        System.out.println("Bob ID: " + bob.getId());
        System.out.println("Bob firstname " + bob.getFirstname());
        System.out.println("Bob lastname " + bob.getLastname());
    }
}
