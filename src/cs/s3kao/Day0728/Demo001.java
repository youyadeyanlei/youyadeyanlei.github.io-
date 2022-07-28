package cs.s3kao.Day0728;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo001 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
// 创建一个顺序流
        Stream<String> stream = list.stream();
// 创建一个并行流
        Stream<String> parallelStream = list.parallelStream();
        int[] array={1,3,5,6,8};
        IntStream stream01 = Arrays.stream(array);
        Stream<Integer> stream001 = Stream.of(1, 2, 3, 4, 5, 6);

        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 3).limit(4);
        stream2.forEach(System.out::println);

        Stream<Double> stream3 = Stream.generate(Math::random).limit(3);
        stream3.forEach(System.out::println);


    }
}
