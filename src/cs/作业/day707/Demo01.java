package cs.作业.day707;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {

        String[] b = {"a","a","b","C"};

//        int[] c={1,2,2,5,6,4,7,8,99};
//        repeat(c);
//        move(c);
//        System.out.println(Arrays.toString(c));


    }

    public static int[] move(int b[]){
        int[] a=new int[b.length-1];
        for (int i = 0; i < a.length ; i++) {
            a[i]=b[i];
        }
        return a;
    }
    /**
     * @param nums 传入数组
     * @return 不重复数组
     */
    public static String[] repeat(String nums[]) {
        String[] nums1=new String[nums.length-1];
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        int a = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[a - 1]) {
                nums[a] = nums[i];
                a++;
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=nums[i];
        }


        return nums1;
    }
}
