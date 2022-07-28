package cs.s3kao.Day0728;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test01 {

        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 6);

            // 自然排序
            Optional<Integer> max = list.stream().max(Integer::compareTo);
            // 自定义排序
            Optional<Integer> max2 = list.stream().max(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            System.out.println("自然排序的最大值：" + max.get());
            System.out.println("自定义排序的最大值：" + max2.get());
        }
    }


