import lesson0306.MyArrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MyArraysCheckArrFor1And4Test {
    int[] arr;
    boolean result;

    public MyArraysCheckArrFor1And4Test(int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4, 4, 1, 1, 4, 4, 1}, true},
                {new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4}, false},
                {new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}, false},
                {new int[]{1, 4, 1, 4, 1, 4, 1, 4, 3}, false},
                {new int[]{}, false},
                {null, false},
        });
    }

    @Test
    public void testCheckArrFor1And4() {
        if (result) {
            Assert.assertTrue(MyArrays.checkArrFor1And4(arr));
        } else {
            Assert.assertFalse(MyArrays.checkArrFor1And4(arr));
        }
    }

}
