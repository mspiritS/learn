public class Massive {
    public int maximum (int [] num) {
        int max = 0;
        for (int i =0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i] ;
            }
        }
        return max;
    }

    public boolean sortArray (int [] num) {
        boolean srt = true;
        for (int i = 1; i< num.length; i++) {
            if (num[i - 1] > num[i]) {
                srt = false;
                break;
            }
        }
        return srt;
    }

    public int [] reverse (int [] num) {

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

}
