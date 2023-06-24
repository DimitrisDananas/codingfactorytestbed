package gr.aueb.cf.Askisi11;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Dimitris", "Dananas");
        UserCredentials uC = new UserCredentials(1, "Dimit", "12345678");

        System.out.println(user.getId());
        System.out.println(user.getFirstname());
        System.out.println(user.getLastname());

        System.out.println();

        System.out.println(uC.getId());
        System.out.println(uC.getUsername());
        System.out.println(uC.getPassword());
    }
}
