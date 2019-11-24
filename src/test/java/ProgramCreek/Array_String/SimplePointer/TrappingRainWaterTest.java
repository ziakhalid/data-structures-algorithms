package ProgramCreek.Array_String.SimplePointer;

import ProgramCreek.Array_String.SimplePointer.TrappingRainWater;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {

    TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    public void testTrappingWaterNull(){
        int[] input = null;
        int expextation = 0;
        assertEquals(expextation, trappingRainWater.trap(input));
    }

    @Test
    public void testTrappingWaterEmpty(){
        int[] input = {};
        int expextation = 0;
        assertEquals(expextation, trappingRainWater.trap(input));
    }

    @Test
    public void testTrappingWater1(){
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expextation = 6;
        assertEquals(expextation, trappingRainWater.trap(input));
    }

}