package ProgramCreek.Array_String.BinarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void searchInsertPosition1(){
        int[] inputArr = {1,3,5,6};
        int inputNum = 5;
        int expected = 2;
        assertEquals(expected, searchInsertPosition.searchInsert(inputArr, inputNum));
    }

    @Test
    public void searchInsertPosition2(){
        int[] inputArr = {1,3,5,6};
        int inputNum = 2;
        int expected = 1;
        assertEquals(expected, searchInsertPosition.searchInsert(inputArr, inputNum));
    }

    @Test
    public void searchInsertPosition3(){
        int[] inputArr = {1,3,5,6};
        int inputNum = 7;
        int expected = 4;
        assertEquals(expected, searchInsertPosition.searchInsert(inputArr, inputNum));
    }

    @Test
    public void searchInsertPosition4(){
        int[] inputArr = {1,3,5,6};
        int inputNum = 0;
        int expected = 0;
        assertEquals(expected, searchInsertPosition.searchInsert(inputArr, inputNum));
    }

}