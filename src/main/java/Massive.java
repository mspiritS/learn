public class Massive {
    public static int maximum (int [] num) throws MassiveException {

        checkArray(num);

        int max = num[0];
        for (int i =1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i] ;
            }
        }
        return max;
    }

    public static boolean sortArray  (int [] num) throws MassiveException {

        checkArray(num);

        boolean srt = true;
        for (int i = 1; i< num.length; i++) {
            if (num[i - 1] > num[i]) {
                srt = false;
                break;
            }
        }
        return srt;
    }

    public static int [] reverse (int [] num) throws MassiveException {

        checkArray(num);

        int k = (num.length%2==0)?0:1;
        int temp;

        for (int i =0;i < num.length/2;i++){
            if (i%2==1){
                temp = num[i];
                num[i] = num[num.length - i - k];
                num[num.length - i - k] = temp;
            }
        }

        return num;
    }

    private static int [] checkArray (int [] num) throws MassiveException {
        if (num == null){
            throw new MassiveException("Array is NULL");
        } else if (num.length == 0){
            throw new MassiveException("Array is empty");
        }
        return num;
    }

}
