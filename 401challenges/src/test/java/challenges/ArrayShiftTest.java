package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test public void insertShiftArrayTest ()
    {
        ArrayShift iArray =  new ArrayShift();
       // assertTrue("someLibraryMethod should return 'true'", iArray.insertShiftArray());

        int[] expected_1 ={2,4,5,6,8};
        assertArrayEquals(expected_1,iArray.insertShiftArray());


      //  int[] expected_2 ={4,8,15,16,23,42};
        //  assertArrayEquals(expected_2,iArray.insertShiftArray());

    }
}


