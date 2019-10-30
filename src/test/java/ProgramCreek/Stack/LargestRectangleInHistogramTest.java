package ProgramCreek.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRectangleInHistogramTest {

    private LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();

    @Test
    public void largestRectangleAreaNull() {
        int[] input = null;
        int expectation = 0;
        assertEquals(expectation, largestRectangleInHistogram.largestRectangleArea(input));
    }

    @Test
    public void largestRectangleAreaEmpty() {
        int[] input = {};
        int expectation = 0;
        assertEquals(expectation, largestRectangleInHistogram.largestRectangleArea(input));
    }

    @Test
    public void largestRectangleArea1() {
        int[] input = {2, 1, 5, 6, 2, 3};
        int expectation = 10;
        assertEquals(expectation, largestRectangleInHistogram.largestRectangleArea(input));
    }

    @Test
    public void largestRectangleArea2() {
        int[] input = {0, 0, 0, 0};
        int expectation = 0;
        assertEquals(expectation, largestRectangleInHistogram.largestRectangleArea(input));
    }

    @Test
    public void largestRectangleArea3() {
        int[] input = {1, 2, 3, 4};
        int expectation = 6;
        assertEquals(expectation, largestRectangleInHistogram.largestRectangleArea(input));
    }

    @Test
    public void largestRectangleArea4() {
        int[] input = {4, 3, 2, 1};
        int expectation = 6;
        assertEquals(expectation, largestRectangleInHistogram.largestRectangleArea(input));
    }

}