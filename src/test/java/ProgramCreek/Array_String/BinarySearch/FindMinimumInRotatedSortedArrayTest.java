package ProgramCreek.Array_String.BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinimumInRotatedSortedArrayTest {

    FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

    @Test
    public void setFirstBadVersion1(){
        int[] input = {3, 4, 5, 1, 2};
        int expected = 1;
        assertEquals(expected, findMinimumInRotatedSortedArray.findMin(input));
    }

}