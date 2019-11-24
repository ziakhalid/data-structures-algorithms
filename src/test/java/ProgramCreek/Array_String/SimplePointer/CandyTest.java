package ProgramCreek.Array_String.SimplePointer;

import ProgramCreek.Array_String.SimplePointer.Candy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyTest {

    Candy candy = new Candy();

    @Test
    public void candyTestNull() {
        int[] inputArray = null;
        int expected = -1;
        assertEquals(expected, candy.candy(inputArray));
    }

    @Test
    public void candyTestEmpty() {
        int[] inputArray = {};
        int expected = -1;
        assertEquals(expected, candy.candy(inputArray));
    }

    @Test
    public void candyTest1() {
        int[] inputArray = {1, 0, 0};
        int expected = 4;
        assertEquals(expected, candy.candy(inputArray));
    }

    @Test
    public void candyTest2() {
        int[] inputArray = {1, 0, 2};
        int expected = 5;
        assertEquals(expected, candy.candy(inputArray));
    }

    @Test
    public void candyTest3() {
        int[] inputArray = {1, 2, 2};
        int expected = 4;
        assertEquals(expected, candy.candy(inputArray));
    }
}