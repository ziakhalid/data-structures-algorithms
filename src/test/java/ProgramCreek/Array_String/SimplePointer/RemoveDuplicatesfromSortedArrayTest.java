package ProgramCreek.Array_String.SimplePointer;

import ProgramCreek.Array_String.SimplePointer.RemoveDuplicatesfromSortedArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesfromSortedArrayTest {

    RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();

    @Test
    public void removeDuplicatesNull(){
        int[] input = null;
        int expected = -1;
        assertEquals(expected, removeDuplicatesfromSortedArray.removeDuplicates(input));
    }


    @Test
    public void removeDuplicates1(){
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int expected = 5;
        assertEquals(expected, removeDuplicatesfromSortedArray.removeDuplicates(input));
    }

}