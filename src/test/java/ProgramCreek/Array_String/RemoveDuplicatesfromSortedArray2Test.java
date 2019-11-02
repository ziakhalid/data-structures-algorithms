package ProgramCreek.Array_String;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesfromSortedArray2Test {

    RemoveDuplicatesfromSortedArray2 removeDuplicatesfromSortedArray2 = new RemoveDuplicatesfromSortedArray2();

    @Test
    public void removeDuplicatesNull(){
        int[] input = null;
        int expected = 0;
        assertEquals(expected, removeDuplicatesfromSortedArray2.removeDuplicates(input));
    }

    @Test
    public void removeDuplicates(){
        int[] input = {1,1,1,2,2,3};
        int expected = 5;
        assertEquals(expected, removeDuplicatesfromSortedArray2.removeDuplicates(input));
    }

}