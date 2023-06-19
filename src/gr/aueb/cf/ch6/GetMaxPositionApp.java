package gr.aueb.cf.ch6;

/**
 * Βρίσκει την θέση index του μεγαλύτερου
 * στοιχείου ενός πίνακα.
 */
public class GetMaxPositionApp {
    public static void main(String[] args) {

    }

    public static int getMaxPosition(int[] arr, int low, int high){
        if ((arr == null) || low < 0 || high > arr.length - 1) return -1;
        int maximumPosition = 0;
        int tmp = 0;
        for (int i = low; i <= high; i++){
            if (tmp < arr[i]){
                tmp = arr[i];
                maximumPosition = i;
            } else {
                continue;
            }
        }
        return maximumPosition;
    }
}
