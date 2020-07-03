package lesson0306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp0306 {

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int [] arr2 = {1, 2, 4, 4, 2, 3, 3, 1, 7};
        int [] arr3 = {1, 2, 4, 4, 2, 3, 4, 1, 4};
        int [] arr4 = {1, 2, 3, 5, 2, 3, 7, 1, 7};
        int [] arr5 = {};
        int [] arr6 = null;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(getArrAfter4(arr1)));
        System.out.println("");

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(getArrAfter4(arr2)));
        System.out.println("");

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(getArrAfter4(arr3)));
        System.out.println("");

    }

    static int[] getArrAfter4(int[] arr) {
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
