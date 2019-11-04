package ProgramCreek.Array_String;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    FirstBadVersion firstBadVersion = new FirstBadVersion();

    @Test
    public void setFirstBadVersion1(){

        int input = 18;
        int expected = 9;
        assertEquals(expected, firstBadVersion.firstBadVersion(input));
    }

}