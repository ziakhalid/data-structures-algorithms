package ProgramCreek.Array_String;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {


    ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    public void productOfArrayExceptSelf1() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(input));
    }

}