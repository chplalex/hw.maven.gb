package lesson0306;

import java.util.Arrays;

import static lesson0306.MyArrays.getArrAfter4;

public class MainApp0306 {

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int [] arr2 = {1, 2, 4, 4, 2, 3, 3, 1, 7};
        int [] arr3 = {1, 2, 4, 4, 2, 3, 4, 1, 4};

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

}
