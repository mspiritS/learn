import java.util.Arrays;

public class Program {

    public static void main (String [] args) {

        int [] nums = new int[] {1,2,3,5,6,12};

        Massive massive = new Massive();

        System.out.println("Максимальное число массива " + massive.maximum(nums));

        System.out.println(Arrays.toString(massive.reverse(nums)));


    }
}
