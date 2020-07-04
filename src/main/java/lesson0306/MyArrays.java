package lesson0306;

import java.util.Arrays;

public class MyArrays {

    public static int[] getArrAfter4(int[] arr) {
        if (arr == null) {
            throw new RuntimeException("Null pointer array in not permitted");
        }
        if (arr.length == 0) {
            throw new RuntimeException("Empty array in not permitted");
        }
        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("No 4 digit in the array");
    }

}
