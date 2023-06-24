package gr.aueb.cf.bankapp.model;

/**
 * Utility class for bigger withdraws than the balance of an account.
 *
 * @author DimitrisDananas
 */
public class OverfraftAccount {
    private static double debt;


    // Public API

    /**
     * It makes possible to withdraw an amount from the account
     * that is bigger than the current balance of the account.
     * @param amount
     *             The amount to be withdrawn.
     * @param balance
     *             The current balance of the account.
     * @return
     *              Returns the debt of the account.
     */
    public static double inDebt(double amount, double balance){
        debt = amount - balance;
        System.out.println("You got in debt\nDebt is: " + debt);

        return debt;
    }
}
