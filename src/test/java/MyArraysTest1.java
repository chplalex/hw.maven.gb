import lesson0306.MyArrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MyArraysTest1 {
    int[] inptArr;
    int[] exptArr;

    public MyArraysTest1(int[] initArr, int[] exptArr) {
        this.inptArr = initArr;
        this.exptArr = exptArr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int []{1, 7}},
                {new int[]{1, 2, 4, 4, 2, 3, 5, 1, 7}, new int []{2, 3, 5, 1, 7}},
                {new int[]{1, 2, 4, 4, 2, 3, 5, 1, 4}, new int []{}},
        });
    }

    @Test
    public void testGetArrAfter4() {
        Assert.assertArrayEquals(exptArr, MyArrays.getArrAfter4(inptArr));
    }

}
