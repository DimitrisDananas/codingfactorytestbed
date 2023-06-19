package gr.aueb.cf.ch6;

/**
 * Εκτυπώνει ενα πινακα με χρηση μεθόδου
 */
public class PrintArrayMethod {
    public static void main(String[] args) {
        int[] ages = {19, 20, 25, 30};
        printAraay(ages);
    }

    public static void printAraay(int[] arr){
        for (int item: arr){
            System.out.print(item + " ");
        }
    }
}
