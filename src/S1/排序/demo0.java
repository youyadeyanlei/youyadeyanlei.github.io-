package S1.排序;

import java.util.*;

/**
 * 插入排序
 */
public class demo0 {

        //对数组a的元素进行排序
        public static void sort(Comparable[] a){
            for(int i=1;i<a.length;i++){
                //当前元素为a[i],依次和i前面的元素比较，找到一个小于等于a[i]的元素
                for(int j=i;j>0;j--){
                    if(greater(a[j-1],a[j])){
                        exchange(a,j-1,j);


                    }else{
                        //找到了该元素，结束
                        break;
                    }
                }
            }

        }
        //比较v元素是否大于w元素
        private static boolean greater(Comparable v,Comparable w){
            return v.compareTo(w)>0;
        }
        //数组元素i和j交换位置
        private static void exchange(Comparable[] a,int i,int j){
            Comparable t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
    }
    //测试代码
    class Test{
        public static void main(String[] args) {
            Integer[] a={4,3,2,10,12,1,5,6,0,2};
            demo0.sort(a);
            System.out.println(Arrays.toString(a));
        }

}
