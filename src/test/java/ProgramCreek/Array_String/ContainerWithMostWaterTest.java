package ProgramCreek.Array_String;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void containerWithMostWaterNull() {
        int[] input = null;
        int expected = 0;
        assertEquals(expected, containerWithMostWater.maxArea(input));
    }

    @Test
    public void containerWithMostWaterEmpty() {
        int[] input = {1};
        int expected = 0;
        assertEquals(expected, containerWithMostWater.maxArea(input));
    }

    @Test
    public void containerWithMostWater1() {
        int[] input = {0, 0, 0, 0, 1};
        int expected = 0;
        assertEquals(expected, containerWithMostWater.maxArea(input));
    }

    @Test
    public void containerWithMostWater2() {
        int[] input = {2, 4, 2, 4};
        int expected = 8;
        assertEquals(expected, containerWithMostWater.maxArea(input));
    }

}