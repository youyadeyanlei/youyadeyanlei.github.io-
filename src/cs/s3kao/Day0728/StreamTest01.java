package cs.s3kao.Day0728;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        List<String> collect = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        Optional<String> max = list.stream()
                .filter(f->f.length()>5)
                .max(Comparator.comparing(String::length));
        System.out.println("最长的字符串：" + max.get());
        Optional<String> min = list.stream()
                .filter(f->f.length() > 5)
                .min(Comparator.comparing(String::length));
        System.out.println("最段的字符串：" + min.get());
        Optional<String> any = list.stream()
                .filter(f -> f.length() > 5)
                .findAny();
        Optional<String> max3 = list.stream()
                .max(String::compareTo);
        System.out.println(max3);
        Optional<String> max4 = list.stream()
                .max(Comparator.naturalOrder());

        System.out.println(max4);
//        public int compareTo(String max,String any){
//            return max.compareTo(any);
//        }

        List<Integer> list1 = Arrays.asList(7, 6, 9, 4, 11, 6);
        // 自然排序
        Optional<Integer> max1 = list1.stream().max(Integer::compareTo);
        // 自定义排序
        Optional<Integer> max2 = list1.stream().max(Comparator.naturalOrder());
        System.out.println("自然排序的最大值：" + max1.get());
        System.out.println("自定义排序的最大值：" + max2.get());

        long count = list1.stream()
                .filter(x -> x > 5)
                .count();
        System.out.println(count);

    }
}

