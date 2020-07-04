import lesson0306.MyArrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MyArraysGetArrAfter4Test2 {
    int[] inputArr;

    public MyArraysGetArrAfter4Test2(int[] inputArr) {
        this.inputArr = inputArr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{}},
                {new int[]{1, 2, 3, 5, 2, 3, 5, 1, 7}},
                {null},
        });
    }

    @Test(expected = RuntimeException.class)
    public void testGetArrAfter4() {
        int[] arr = MyArrays.getArrAfter4(inputArr);
    }

}
