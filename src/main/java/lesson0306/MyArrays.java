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

    public static boolean checkArrFor1And4(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        boolean present1 = false;
        boolean present4 = false;
        for(int i: arr) {
            if (i == 1) {
                present1 = true;
                continue;
            }
            if (i == 4) {
                present4 = true;
                continue;
            }
            return false;
        }
        return (present1 && present4);
    }

}
