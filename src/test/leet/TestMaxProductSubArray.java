package test.leet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kevin.code.leet.MaxProductSubArray;


class TestMaxProductSubArray {

    @Test void testBasic() {
        final int[] input = new int[] { 2, 3, -2, 4 };
        final int expected = 6;
        final MaxProductSubArray maxProduct = new MaxProductSubArray();
        final int actual = maxProduct.maxProduct(input);
        assertEquals(expected, actual);
    }

}
