package cs.作业.Day721;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Demo02 {
    private static final Random ran = new Random(); // 对于引用类型，只要它自己的地址不发生改变，也可以修饰为final的

    public static  int randomNumber(int min, int max){
        if (max < min) {
            System.out.printf("%d 不能 比 %d 小\r\n", max, min);
        }
        return ran.nextInt(max - min) + min;
    }
public static int randomNumber(int max){
        return randomNumber(1,max);
}


    public static void main(String[] args) {
        int count = 8;
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = randomNumber(100);
        }
        int[] mergesort =mergesort(arr);
    }

    private static int[] mergesort(int[] arr) {
        //拆分

        if (arr.length==1)return arr;

        int[] left =new int[arr.length/2];
        System.arraycopy(arr,0,left,0,left.length);
        System.out.println("left"+ Arrays.toString(left));
        int[] leftSorted =mergesort(left);

        int[]righ =new int[arr.length-left.length];
        System.arraycopy(arr,left.length,righ,0,righ.length);
        System.out.println("hou"+Arrays.toString(righ));
        int[] righsorted =mergesort(righ);
        return merge(leftSorted,righsorted);
    }

    private static int[] merge(int[] leftSorted, int[] righsorted) {
        int[] sorted =new int[leftSorted.length+righsorted.length];

        int p=0;
        int lp=0;
        int rp=0;
        while ((lp<leftSorted.length&&rp<righsorted.length)){
            if (leftSorted[lp]<=righsorted[rp]) sorted[p] =leftSorted[lp++];
        else  sorted[p] =righsorted[rp++];
        p++;

        }
        if (lp==leftSorted.length){
            System.arraycopy(righsorted,rp,sorted,p,sorted.length-p);
        }else {
            System.arraycopy(leftSorted,lp,sorted,p,sorted.length-p);
        }
        return sorted;
    }


}
