package gr.aueb.cf.ch6;

public class BigInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(arr, 1, 7);
    }

    public static void printArray(int[] arr, int low, int high){
//        if (arr == null) return;
        if ((arr == null) || low < 0 || high > arr.length - 1) return;

        for (int i = low; i <= high; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
