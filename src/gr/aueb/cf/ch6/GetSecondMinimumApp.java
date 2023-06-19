package gr.aueb.cf.ch6;

/**
 * Ταξινομεί έναν πίνακα και επιστρέφει
 * το δεύτερο μικρότερο του πίνακα.
 */
public class GetSecondMinimumApp {
    public static void main(String[] args) {
        int[] arr = {5,6,4,9,3,2,10,1};
        int sec = getSecondMinimum(arr);
        System.out.println(sec);
    }

    public static int getSecondMinimum(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return  arr[1];
    }
}
