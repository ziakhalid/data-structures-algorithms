package ProgramCreek.Array_String.SimplePointer;

import ProgramCreek.Array_String.SimplePointer.MinimumSizeSubarraySum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSizeSubarraySumTest {


    MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();

    @Test
    public void minSubArrayNull() {
        int[] input = null;
        int target = 6;
        int expected = 0;
        assertEquals(expected, minimumSizeSubarraySum.minSubArray(target, input));
    }

    @Test
    public void minSubArray1() {
        int[] input = {6};
        int target = 6;
        int expected = 1;
        assertEquals(expected, minimumSizeSubarraySum.minSubArray(target, input));
    }

    @Test
    public void minSubArray2() {
        int[] input = {2,3,1,2,4,3};
        int target = 7;
        int expected = 2;
        assertEquals(expected, minimumSizeSubarraySum.minSubArray(target, input));
    }

    @Test
    public void minSubArray3() {
        int[] input = {7,7,7,7};
        int target = 7;
        int expected = 1;
        assertEquals(expected, minimumSizeSubarraySum.minSubArray(target, input));
    }
}