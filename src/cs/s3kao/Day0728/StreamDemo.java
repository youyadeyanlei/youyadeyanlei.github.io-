package cs.s3kao.Day0728;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
 
        public static void main(String[] args) {
            List list = new ArrayList<Integer>();
            Stream stream1 = list.stream();

            int[] arr = {1, 2, 3};
            IntStream stream2 = Arrays.stream(arr);
            stream2.forEach(System.out::println);

            Stream<Integer> stream3 = Stream.of(1, 2, 3);

            Stream<Double> stream4 = Stream.generate(Math::random);
            stream4.limit(4).forEach(System.out::println);

            Stream<Integer> stream5 = Stream.iterate(1, n -> n + 1);
            stream5.limit(5).forEach(System.out::println);
        }
    
}
