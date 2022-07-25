package cs.作业.Day721;

import java.util.Arrays;
import java.util.Random;

/**
 * @author gu
 */
public class Demo3 {
    public static void main(String[] args) {
        //记录为8
        int count = 8;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = roandom(100);
        }
        System.out.println(Arrays.toString(arr));
        //归并
       int[] merge= mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] mergesort(int[] merge) {
        if (merge.length==1) {
            return merge;
        }
        //前半段
        int[] before=new int[merge.length/2];
        //将mergs数组放进去，从0开始，放到before数字，从0开始，到before.length
        System.arraycopy(merge,0,before,0,before.length);
        System.out.println("拆分前半段"+Arrays.toString(before));
        int[] before1=mergesort(before);
        //后半段
        int[] after=new  int[merge.length-before.length];
        //同前面
        System.arraycopy(merge,before.length,after,0,after.length);
        System.out.println("后半部分"+Arrays.toString(after));
        int[] after1 =mergesort(after);
        return merge(before,after);

    }

    //排序

    private static int[] merge(int[] before, int[] after) {
    //临时存放数组
        int[] type =new int[before.length+after.length];
        int i=0;
        int n=0;
        int a=0;
        //如果a=长度，说明他的数组用完了
        while (a<before.length&&n<after.length){

            if (before[a]<=after[n]) {
                type[i]=before[a++];

            }else {
                type[i]=after[n++];

            }
            i++;
        }

        return type;
    }



    private static int roandom(int i) {
        Random random = new Random();
        return random.nextInt(i) + 1;
    }
}
