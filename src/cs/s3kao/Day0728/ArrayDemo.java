package cs.s3kao.Day0728;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ArrayDemo{
    public static void main(String[] args) {
        Random random = new Random();
        Function<Integer,int[]> function =(size)->{
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100);
            }
          return array;
        };
        int[] aar= function.apply(20);

        IntStream stream = Arrays.stream(aar);

        stream.forEach(System.out ::println);

        stream = Arrays.stream(aar);
        stream
                .filter((item)->item%2==0)//过滤器
                .limit(5)//限定
                .forEach(System.out ::println);

    }
    private  static int[] genNumbers(int size){
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i]=random.nextInt(100);
        }
    return arr;

    }
}
