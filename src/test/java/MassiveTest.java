import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.rmi.server.ExportException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MassiveTest {

    @Test
    public void maximum() throws MassiveException {
        int [] arr = new int[] {1,2,3,7,4,5};
        int actual = Massive.maximum(arr);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void sortedArray() throws MassiveException{
        int [] arr = new int[] {1,2,3,4,5};
        boolean actual = Massive.sortArray(arr);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    

    @Test
    public void unsortedArray() throws MassiveException{
        int [] arr = new int[] {1,2,3,7,4,5};
        boolean actual = Massive.sortArray(arr);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void reverse() throws MassiveException{
        int [] arr = new int[] {1,2,3,7,4,5};
        int [] expected = new int[] {1,5,3,7,4,2};
        arr = Massive.reverse(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void negativeReverse() throws MassiveException{
        int [] arr = new int[] {1,2,3,7,4,5};
        int [] expected = new int[] {1,2,3,7,4,5};
        arr = Massive.reverse(arr);
        assertFalse(Arrays.equals(arr, expected));

    }



}