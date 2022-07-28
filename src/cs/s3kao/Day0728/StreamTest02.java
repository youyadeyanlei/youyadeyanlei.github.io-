package cs.s3kao.Day0728;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
        public static void main(String[] args) {
            String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
            List<String> strList = Arrays.stream(strArr)
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            strList.forEach(System.out::println);

            List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
            List<Integer> intListNew = intList.stream().map(x -> x + 3).collect(Collectors.toList());

            System.out.println("每个元素大写：" + strList);
            System.out.println("每个元素+3：" + intListNew);




    }

}
