import static org.junit.Assert.*;

public class MassiveTest {

    @org.junit.Test
    public void maximum() {
        int [] arr = new int[] {1,2,3,7,4,5};
        Massive massive = new Massive();
        int actual = massive.maximum(arr);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sortedArray() {
        int [] arr = new int[] {1,2,3,4,5};
        Massive massive = new Massive();
        boolean actual = massive.sortArray(arr);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void unsortedArray() {
        int [] arr = new int[] {1,2,3,7,4,5};
        Massive massive = new Massive();
        boolean actual = massive.sortArray(arr);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void reverse() {
        int [] arr = new int[] {1,2,3,7,4,5};
        int [] expected = new int[] {1,5,3,7,4,2};
        Massive massive = new Massive();
        arr = massive.reverse(arr);
        assertArrayEquals(expected, arr);
    }



}