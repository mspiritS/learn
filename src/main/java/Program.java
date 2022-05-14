import java.util.Arrays;

public class Program {

    public static void main (String [] args) throws MassiveException {

        int [] nums = new int[] {1,2,3,5,6,12};

        System.out.println("Максимальное число массива " + Massive.maximum(nums));

        System.out.println(Arrays.toString(Massive.reverse(nums)));


    }
}
